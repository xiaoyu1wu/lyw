package com.lyw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyw.domain.TbHunt;
import com.lyw.domain.TbHuntExample;
import com.lyw.domain.TbResume;
import com.lyw.domain.TbResumeExample;
import com.lyw.domain.TbUser;
import com.lyw.domain.TbUserExample;
import com.lyw.mapper.TbHuntMapper;
import com.lyw.mapper.TbResumeMapper;
import com.lyw.mapper.TbUserMapper;
import com.lyw.util.Encrypter;

@Service
public class MyService {

	@Autowired
	private TbUserMapper tbUserMapper;
	@Autowired
	private TbHuntMapper tbHuntMapper;
	@Autowired
	private TbResumeMapper tbResumeMapper;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public TbUser getUserById(int id){
		return tbUserMapper.selectByPrimaryKey(id);
	}
	
	public List<TbHunt> getMyHunts(Integer userId){
		TbHuntExample example = new TbHuntExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return tbHuntMapper.selectByExample(example);
	}
	
	public void changeUserName(Integer userId, String name){
		TbUser user = new TbUser();
		user.setUserId(userId);
		user.setUserName(name);
		tbUserMapper.updateByPrimaryKeySelective(user);
	}
	
	public boolean changePassword(Integer userId,String oldpassword, String newpssword){
		TbUserExample userExample = new TbUserExample();
		userExample.createCriteria().andUserPasswordEqualTo(Encrypter.encryption(oldpassword)).andUserIdEqualTo(userId);
		if(tbUserMapper.selectByExample(userExample).size()>0){
			TbUser user = new TbUser();
			user.setUserId(userId);
			user.setUserPassword(newpssword);
			tbUserMapper.updateByPrimaryKeySelective(user);
			return true;
		}
		return false;
	}
	
	public List<TbResume> getMyResumes (Integer userId){
		TbResumeExample example = new TbResumeExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return tbResumeMapper.selectByExample(example);
	}
	
	public TbResume getResumeMessage(Integer resumeId){
		return tbResumeMapper.selectByPrimaryKey(resumeId);
	}
}
