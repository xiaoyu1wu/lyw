package com.lyw.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyw.domain.TbAdmin;
import com.lyw.domain.TbRecruit;
import com.lyw.mapper.TbAdminMapper;
import com.lyw.mapper.TbRecruitMapper;

@Service
public class AdminService {
	@Resource
	private TbAdminMapper tbAdminMapper;
	
	@Resource
	private TbRecruitMapper tbRecruitMapper;
	
	public TbAdminMapper getTbAdminMapper() {
		return tbAdminMapper;
	}

	public void setTbAdminMapper(TbAdminMapper tbAdminMapper) {
		this.tbAdminMapper = tbAdminMapper;
	}
	
	public TbAdmin getTbAdminById(Integer id){
		return tbAdminMapper.selectByPrimaryKey(id);
	}

	public void publicJob(int adminId, TbRecruit recruit) {
		tbRecruitMapper.insert(recruit);
	}
}
