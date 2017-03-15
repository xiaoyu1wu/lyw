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

import com.lyw.domain.TbMessage;
import com.lyw.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	@Autowired
	private MessageService msgService;
	
	@RequestMapping(value="/getSystemMessage", method = RequestMethod.GET)
	public @ResponseBody List<TbMessage> getAllSysMsg(){
		return msgService.getAllSysMsg();
	}
	
	@RequestMapping(value="/getRecommendMessage", method = RequestMethod.GET)
	public @ResponseBody List<TbMessage> getRecommendMessage(){
		return msgService.getRecommendMessage();
	}
	
	@RequestMapping(value="/getRecruitMessage", method = RequestMethod.GET)
	public @ResponseBody List<TbMessage> getRecruitMessage(Model model, HttpServletRequest request, HttpSession session){
		Integer userId = (Integer) session.getAttribute("userId");
		return msgService.getRecruitMessage(userId);
	}
}
