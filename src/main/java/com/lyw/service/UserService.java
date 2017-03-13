package com.lyw.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyw.domain.TbUser;
import com.lyw.mapper.TbUserMapper;

@Service
public class UserService {
	@Resource
	private TbUserMapper tbUserMapper;

	public int findUserIdByUsername(String username) {
		return tbUserMapper.findUserIdByUsername(username);
	}

	public int saveUser(TbUser user) {
		return tbUserMapper.insertSelective(user);
	}

	public int findUserIdByUsernameAndPassword(String username, String password) {
		TbUser user = new TbUser();
		user.setUserName(username);
		user.setUserPassword(password);
		
		return tbUserMapper.findUserIdByUsernameAndPassword(user);
		
	}

}
