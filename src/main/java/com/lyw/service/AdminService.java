package com.lyw.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyw.domain.TbAdmin;
import com.lyw.mapper.TbAdminMapper;

@Service
public class AdminService {
	@Resource
	private TbAdminMapper tbAdminMapper;

	public TbAdminMapper getTbAdminMapper() {
		return tbAdminMapper;
	}

	public void setTbAdminMapper(TbAdminMapper tbAdminMapper) {
		this.tbAdminMapper = tbAdminMapper;
	}
	
	public TbAdmin getTbAdminById(Integer id){
		return tbAdminMapper.selectByPrimaryKey(id);
	}
}
