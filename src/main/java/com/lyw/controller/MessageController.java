package com.lyw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lyw.domain.TbMessage;
import com.lyw.domain.TbRecruit;
import com.lyw.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	@Autowired
	private MessageService msgService;
	
	@RequestMapping(value="/getSystemMessage", method = RequestMethod.GET)
	public ModelAndView getAllSysMsg(){
		ModelAndView model = new ModelAndView("/messageCenter/systemMessage");
		List<TbMessage> messageList =  msgService.getAllSysMsg();
		model.addObject("messageList", messageList);
		return model;
	}
	
	@RequestMapping(value="/getRecommendMessage", method = RequestMethod.GET)
	public ModelAndView getRecommendMessage(){
		ModelAndView model = new ModelAndView("/messageCenter/recommendMessage");
		List<TbMessage> messageList =  msgService.getRecommendMessage();
		model.addObject("messageList", messageList);
		return model;
	}
	
	@RequestMapping(value="/getRecruitMessage", method = RequestMethod.GET)
	public ModelAndView getRecruitMessage(HttpServletRequest request, HttpSession session){
		Integer userId = (Integer) session.getAttribute("userId");
		ModelAndView model = new ModelAndView("/messageCenter/recruitMessage");
		List<TbMessage> messageList =  msgService.getRecruitMessage(userId);
		model.addObject("messageList", messageList);
		return model;
	}
}
