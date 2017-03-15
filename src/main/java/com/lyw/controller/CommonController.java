package com.lyw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lyw.domain.TbRecruit;
import com.lyw.service.RecruitService;

@Controller
@RequestMapping("/common")
public class CommonController {
	@Autowired
	private RecruitService recruitService;
	
	@RequestMapping(value="/searchJob/{keyword}", method=RequestMethod.GET)
	public @ResponseBody List<TbRecruit> searchJob(@PathVariable String keyword){
		return recruitService.findJobByRecrJob(keyword);
	}
}
