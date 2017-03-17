package com.lyw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyw.domain.TbResume;
import com.lyw.domain.TbUser;
import com.lyw.service.MyService;

@Controller
@RequestMapping("/usermessage")
public class MyController {

	@Autowired
	private MyService myService;
	
	private Integer getUserIdBySession(HttpServletRequest request){
		return (Integer) request.getSession().getAttribute("userId");
	}
	
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
	
	@RequestMapping("personCenter")
	public String enterPersonCenter(HttpServletRequest request){
		TbUser user = myService.getUserById(getUserIdBySession(request));
		request.setAttribute("user", user);
		return "/personalCenter/personCenter";
	}
	
	@RequestMapping("modifyMyMessage")
	public String modifyMyMessage(TbUser user, HttpServletRequest request){
		user.setUserId(getUserIdBySession(request));
		myService.updateMyMessage(user);
		return "redirect:personCenter.do";
	}
	
	@RequestMapping("myResume")
	public String enterMyResume(HttpServletRequest request){
//		request.setAttribute("resumes", myService.getMyResumes(getUserIdBySession(request)));
		request.setAttribute("resumes", myService.getMyResumes(4));
		return "/personalCenter/myResume";
	}
	
	@RequestMapping("myResumeDetail")
	public String myResumeDetail(HttpServletRequest request, Integer resumeId){
		return "/personalCenter/resumeDetail";
	}
	
	@RequestMapping("addResumePage")
	public String addResumePage(HttpServletRequest request){
		return "/personalCenter/addResume";
	}
	
	@RequestMapping("addResumee")
	public String addResume(TbResume resume, HttpServletRequest request){
		resume.setUserId(getUserIdBySession(request));
		myService.addResume(resume);
		return "redicect:addResumePage.do";
	}
	
	@RequestMapping("myDeliver")
	public String enterMyDeliver(){
		return "/personalCenter/myDeliver";
	}
	
	@RequestMapping("myApplicationForJob")
	public String enterMyApplicationForJob(HttpServletRequest request){
		request.setAttribute("hunts", myService.getMyHunts(4));
		return "/personalCenter/myApplicationForJob";
	}
	
	@RequestMapping("searchJobDetail")
	public String searchJobDetail(HttpServletRequest request, Integer huntId){
		request.setAttribute("hunt", myService.getHuntById(huntId));
		return "/personalCenter/myApplicationForJob";
	}
	
	@RequestMapping("modifyPassword")
	public String enterModifyPassword(){
		return "/personalCenter/modifyPassword";
	}
}
