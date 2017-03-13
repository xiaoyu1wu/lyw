package com.lyw.controller;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyw.domain.TbAdmin;
import com.lyw.service.AdminService;

@RequestMapping("/admin")
@Controller
public class TbAdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/getAdminMessage")
	public @ResponseBody TbAdmin getAdminMessage(){
		return adminService.getTbAdminById(2);
	}
}
