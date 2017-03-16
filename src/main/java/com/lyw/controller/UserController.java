package com.lyw.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lyw.domain.TbCompany;
import com.lyw.domain.TbHunt;
import com.lyw.domain.TbRecruit;
import com.lyw.domain.TbUser;
import com.lyw.dto.UserRegeditInfo;
import com.lyw.service.CompanyService;
import com.lyw.service.UserService;
import com.lyw.util.Encrypter;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired 
	private CompanyService companyService;
	
	//注册(邮箱、密码必须)
	@RequestMapping(value = "/regedit", method=RequestMethod.POST)
	public ModelAndView regedit(HttpServletRequest request, HttpSession session){
		String email = request.getParameter("email");
		String yzm = request.getParameter("yzm");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String type = request.getParameter("type");
		
		//密码不一致，返回提示信息
		if(!password.equals(confirmPassword)){
			ModelAndView model = new ModelAndView("/regedit");
			model.addObject("message", "密码不一致！");
//			request.setAttribute("message", "密码不一致!");
			return model;
		}
		
		if("person".equals(type)){
			int userId = userService.findUserIdByUserEmail(email);
			//若是新用户,设置到session中，存活周期为10分钟，提示注册成功，跳转到主页面
			if(userId == -1){
				ModelAndView model = new ModelAndView("/index");
				
				TbUser user = new TbUser();
				user.setUserEmail(email);
				user.setUserName(name);
				user.setUserPassword(Encrypter.encryption(password));
				
				userService.saveUser(user);
				
				model.addObject("retCode", 1);
				model.addObject("message", "注册成功");
				
				userId = userService.findUserIdByUserEmail(email);
				session.setAttribute("userId", userId);
				session.setMaxInactiveInterval(10*60);//10分钟超时失效
				return model;
			}
			//如果用户名已经存在，提示“该用户名已被注册”,停留在当前页面
			else{
				ModelAndView model = new ModelAndView("/regedit");
				model.addObject("retCode", 0);
				model.addObject("message", "该用户名已被注册");
				return model;
			}
		}
		else if("company".equals(type)){
			int companyId = companyService.findCompanyIdByEmail(email);
			//若是新用户
			if(companyId == -1){
				ModelAndView model = new ModelAndView("/index");
				
				TbCompany company = new TbCompany();
				company.setCompEmail(email);
				company.setCompName(name);
				company.setCompPassword(Encrypter.encryption(password));
				
				companyService.saveCompany(company);
				
				model.addObject("retCode", 1);
				model.addObject("message", "注册成功");
				
				companyId = companyService.findCompanyIdByEmail(email);
				session.setAttribute("adminId", companyId);
				session.setMaxInactiveInterval(10*60);//10分钟超时失效
				return model;
			}
			//如果用户名已经存在，提示“该用户名已被注册”,停留在当前页面
			else{
				ModelAndView model = new ModelAndView("/regedit");
				model.addObject("retCode", 0);
				model.addObject("message", "该用户名已被注册");
				return model;
			}
		}else{
			ModelAndView model = new ModelAndView("/error");
			model.addObject("retCode", 0);
			model.addObject("message", "系统出现错误!");
			return model;
		}
		
		
		
	}
	
	/*//登录
		@RequestMapping(value = "/login", method=RequestMethod.POST)
		public ModelAndView login(@PathVariable String mail, @PathVariable String userPassword, @PathVariable String userType, TbUser user, Model model, HttpServletRequest request, HttpSession session){
			ModelAndView model1 = new ModelAndView("login");
			request.setAttribute("message", "提示消息");
//			model1.addObject("message", "提示消息");
			return model1;
		}*/
	
	//登录
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpSession session){
		String email = (String) request.getParameter("email");
		String password = (String) request.getParameter("password");
		String type = (String) request.getParameter("type");
		
		//普通用户登录
		if("person".equals(type)){
			String psd = Encrypter.encryption(password);
			int userId = userService.findUserIdByUserEmailAndPassword(email, psd);
			//若用户登录验证通过
			if(userId != -1){
				session.setAttribute("userId", userId);
				
				ModelAndView model = new ModelAndView("/index");
				model.addObject("message", "登录成功");
				return model;
			}
			else{
				ModelAndView model = new ModelAndView("/login");
				model.addObject("message", "用户名或者密码不正确");
				return model;
			}
		}
		//企业登录
		else if("company".equals(type)){
			String psd = Encrypter.encryption(password);
			int companyId = companyService.findCompanyIdByEmailAndPassword(email, psd);
			//若企业登录验证通过
			if(companyId != -1){
				session.setAttribute("adminId", companyId);
				session.setMaxInactiveInterval(10*60);//10分钟超时失效
				
				ModelAndView model = new ModelAndView("/index");
				model.addObject("retCode", 1);
				model.addObject("message", "登录成功");
				return model;
			}
			else{
				ModelAndView model = new ModelAndView("/login");
				model.addObject("retCode", 0);
				model.addObject("message", "用户名或者密码不正确");
				return model;
			}
		}else{
			ModelAndView model = new ModelAndView("/error");
			model.addObject("retCode", 0);
			model.addObject("message", "系统出现错误!");
			return model;
		}
		
	}
	
	//首页
	@RequestMapping(value = "/index")
	public ModelAndView index(){
		
		ModelAndView model = new ModelAndView("/index");
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
		return "/login";
	}
	
	@RequestMapping(value="/redirectRegedit")
	public String redirectRegedit(){
		return "/regedit";
	}

}
