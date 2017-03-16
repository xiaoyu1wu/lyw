package com.lyw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyw.domain.TbAdmin;
import com.lyw.domain.TbRecruit;
import com.lyw.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/getAdminMessage")
	public @ResponseBody TbAdmin getAdminMessage(){
		return adminService.getTbAdminById(2);
	}
	
	//发布招聘
	@RequestMapping(value="/publicJob", method = RequestMethod.POST)
	public @ResponseBody Map<String, String> publicJob(TbRecruit recruit, Model model, HttpServletRequest request, HttpSession session){
		int adminId = (int) session.getAttribute("adminId");
		
		adminService.publicJob(adminId, recruit);
		
		Map<String, String> returnMap = new HashMap<String, String>();
		returnMap.put("result", "1");
		return returnMap;
		
	}
}
