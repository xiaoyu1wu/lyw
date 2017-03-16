package com.lyw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lyw.domain.TbRecruit;
import com.lyw.service.RecruitService;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	@Autowired
	private RecruitService recruitService;
	
	@RequestMapping("/recentRecruit")
	public  ModelAndView getRecentRecruit(HttpServletRequest request, HttpSession session){
		ModelAndView model = new ModelAndView("/index");
		List<TbRecruit> recruitList =  recruitService.getRecentRecruit();
		model.addObject("recruitList", recruitList);
		return model;
	}
}

