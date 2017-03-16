package com.lyw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyw.domain.TbRecruit;
import com.lyw.service.RecruitService;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	@Autowired
	private RecruitService recruitService;
	
	@RequestMapping("/recentRecruit")
	public @ResponseBody List<TbRecruit> getRecentRecruit(){
		return recruitService.getRecentRecruit();
	}
}

