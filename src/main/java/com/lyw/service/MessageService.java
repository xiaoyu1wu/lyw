package com.lyw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyw.domain.TbMessage;
import com.lyw.mapper.TbMessageMapper;

@Service
public class MessageService {
	
	@Autowired
	private TbMessageMapper messageMapper;
	
	public List<TbMessage> getAllSysMsg(){
		return messageMapper.getAllSystemMessage();
	}

	public List<TbMessage> getRecommendMessage() {
		return messageMapper.getAllRecommendMessage();
	}


	public List<TbMessage> getRecruitMessage(Integer userId) {
		return messageMapper.getRecruitMessage(userId);
	}
}
