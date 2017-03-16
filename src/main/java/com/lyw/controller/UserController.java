package com.lyw.controller;

import java.util.HashMap;
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

import com.lyw.domain.TbHunt;
import com.lyw.domain.TbRecruit;
import com.lyw.domain.TbUser;
import com.lyw.dto.UserRegeditInfo;
import com.lyw.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//注册(邮箱、密码必须)
	@RequestMapping(value = "/regedit", method=RequestMethod.POST)
	public ModelAndView regedit(TbUser user, Model model, HttpServletRequest request, HttpSession session){
		String email = user.getUserEmail();
		ModelAndView model1 = null;
		int userId = userService.findUserIdByUserEmail(email);
		
		//不存在，插入数据,设置到session中，存活周期为10分钟，提示注册成功，跳转到主页面
		if(userId == -1){
			model1 = new ModelAndView("/user/index");
			
			userService.saveUser(user);
			
			model1.addObject("retCode", 1);
			model1.addObject("message", "注册成功");
			session.setAttribute("userId", userId);
			session.setMaxInactiveInterval(10*60);//10分钟超时失效
			return model1;
		}
		//如果用户名已经存在，提示“该用户名已被注册”,停留在当前页面
		else{
			model1 = new ModelAndView("/user/regedit");
			model1.addObject("retCode", 0);
			model1.addObject("message", "该用户名已被注册");
			return model1;
		}
	}
	
	//登录
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView login(TbUser user, Model model, HttpServletRequest request, HttpSession session){
		ModelAndView model1 = null;
		
		if(null == user.getUserEmail() || "" == user.getUserPassword()){
			model1 = new ModelAndView("/user/login");
			model1.addObject("retCode", 0);
			model1.addObject("message", "邮箱或密码必须填写");
			return model1;
		}else{
			model1 = new ModelAndView();
			String userEmail = user.getUserEmail();
			String password = user.getUserPassword();
			int userId = userService.findUserIdByUserEmailAndPassword(userEmail, password);
			if(userId != -1){
				if(session.getAttribute("userId") == null || "".equals(session.getAttribute("userId"))){
					session.setAttribute("userId", userId);
					session.setMaxInactiveInterval(10*60);//10分钟超时失效
				}
				model1.addObject("retCode", 1);
				model1.addObject("message", "登录成功");
				model1.setViewName("/user/index");
			}
			else{
				model1.addObject("retCode", 0);
				model1.addObject("message", "用户名或者密码错误");
				model1.setViewName("/user/login");
			}
			return model1;
		}
		
	}
	
	//首页
	@RequestMapping(value = "/index")
	public ModelAndView index(){
		ModelAndView model = new ModelAndView("/user/index");
		return model;
	}
	
	//发布求职
	@RequestMapping(value="/publicJob", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> publicJob(TbHunt hunt, Model model, HttpServletRequest request, HttpSession session){
		int userId = (int) session.getAttribute("userId");
		
		userService.applyJob(userId, hunt);
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("retCode", 1);
		return returnMap;
		
	}

	@RequestMapping(value="/redirectLogin")
	public String redirectLogin(){
		return "/user/login";
	}
	
	@RequestMapping(value="/redirectRegedit")
	public String redirectRegedit(){
		return "/user/regedit";
	}
}
