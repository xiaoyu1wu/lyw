package com.lyw.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lyw.domain.TbUser;
import com.lyw.dto.UserRegeditInfo;
import com.lyw.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//注册
	@RequestMapping(value = "/regedit", method=RequestMethod.POST)
	public ModelAndView regedit(TbUser user, Model model, HttpServletRequest request, HttpSession session){
		String username = user.getUserName();
		ModelAndView model1 = null;
		int userId = userService.findUserIdByUsername(username);
		//不存在，插入数据,设置到session中，存活周期为10分钟，提示注册成功，跳转到主页面
		if(userId == -1){
			model1 = new ModelAndView("/user/index");
			
			userService.saveUser(user);
			
			model1.addObject("message", "注册成功");
			session.setAttribute("userId", userId);
			session.setMaxInactiveInterval(10*60);//10分钟超时失效
			return model1;
		}
		//如果用户名已经存在，提示“该用户名已被注册”,停留在当前页面
		else{
			model1 = new ModelAndView("/user/regedit");
			model1.addObject("message", "该用户名已被注册");
			return model1;
		}
	}
	
	//首页
	@RequestMapping(value = "/index")
	public ModelAndView index(){
		ModelAndView model = new ModelAndView("/user/index");
		return model;
	}
	
	//登录
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView login(TbUser user, Model model, HttpServletRequest request, HttpSession session){
		ModelAndView model1 = null;
		
		if(null == user.getUserName() || "" == user.getUserPassword()){
			model1 = new ModelAndView("/user/login");
			model1.addObject("message", "用户名或密码必须填写");
			return model1;
		}else{
			model1 = new ModelAndView();
			String username = user.getUserName();
			String password = user.getUserPassword();
			int userId = userService.findUserIdByUsernameAndPassword(username, password);
			if(userId != -1){
				model1.setViewName("/user/index");
				if(session.getAttribute("userId") == null || "".equals(session.getAttribute("userId"))){
					session.setAttribute("userId", userId);
					session.setMaxInactiveInterval(10*60);//10分钟超时失效
				}
			}
			else{
				model1.addObject("message", "用户名或者密码错误");
				model1.setViewName("/user/login");
			}
			return model1;
		}
		
	}

}
