package com.lyw.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyw.domain.TbUser;
import com.lyw.service.MyService;

@Controller
@RequestMapping("/usermessage")
public class MyController {

	@Autowired
	private MyService myService;
	
	@RequestMapping("mymessage")
	public String getMyMessage( HttpServletRequest request){
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("userId");
		TbUser user = myService.getUserById(userId);
		user.setUserPassword(null);
		request.setAttribute("user", user);
		return "";
	}
	
	@RequestMapping("myhunt")
	public String getMyHunt(HttpServletRequest request){
		Integer userId = (Integer) request.getSession().getAttribute("userid");
		myService.getMyHunts(userId);
		return "";
	}
	
	@RequestMapping("mycount")
	public String getMyCountMessage(HttpServletRequest request){
		Integer userId = (Integer) request.getSession().getAttribute("userid");
		TbUser user = myService.getUserById(userId);
		user.setUserPassword(null);
		request.setAttribute("user", user);
		return "";
	}
	
	
}
