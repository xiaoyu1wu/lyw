package com.lyw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyw.domain.TbRecruit;
import com.lyw.mapper.TbRecruitMapper;

@Service
public class RecruitService {
	@Resource
	private TbRecruitMapper tbRecruitMapper;

	public TbRecruitMapper getTbRecruitMapper() {
		return tbRecruitMapper;
	}

	public void setTbRecruitMapper(TbRecruitMapper tbRecruitMapper) {
		this.tbRecruitMapper = tbRecruitMapper;
	}
	
	//获取最近的招聘信息，默认为10条
	public List<TbRecruit> getRecentRecruit(){
		return tbRecruitMapper.selectByRecruitDate();
	}

	public List<TbRecruit> findJobByRecrJob(String keyword) {
		return tbRecruitMapper.selectByRecrJob(keyword);
	}
}
