package com.lyw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyw.domain.TbCompany;
import com.lyw.domain.TbUser;
import com.lyw.mapper.TbCompanyMapper;

@Service("companyService")
public class CompanyService {
	@Autowired
	private TbCompanyMapper tbCompanyMapper;

	public int findCompanyIdByEmail(String email) {
		return tbCompanyMapper.findCompanyIdByEmail(email);
	}

	public int saveCompany(TbCompany company) {
		return tbCompanyMapper.insertSelective(company);
	}

	public int findCompanyIdByEmailAndPassword(String email, String password) {
		TbCompany company = new TbCompany();
		company.setCompEmail(email);
		company.setCompPassword(password);
		return tbCompanyMapper.findCompanyIdByEmailAndPassword(company);
	}
	
	
}
