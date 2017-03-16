package com.lyw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyw.domain.TbMessage;
import com.lyw.service.MessageService;
import com.lyw.service.UserService;

public class MessageTest {
	
	@Test
	public void testGetAllSystemMessage() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		MessageService messageService = (MessageService) ac.getBean("messageService");
		List<TbMessage> messages = messageService.getAllSysMsg();
		System.out.println(messages.get(0).getContent());
	}
	
	@Test
	public void testGetRecruitMessage() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		MessageService messageService = (MessageService) ac.getBean("messageService");
		List<TbMessage> messages = messageService.getRecruitMessage(1);
		System.out.println(messages.get(0).getContent());
	}
}
