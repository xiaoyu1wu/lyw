package com.lyw.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyw.domain.TbAdmin;
import com.lyw.service.AdminService;

public class AdminTest {

	@Test
	public void testFindAdmins() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		AdminService adminService = (AdminService) ac.getBean("adminService");
		TbAdmin admin = adminService.getTbAdminById(2);
		System.out.println(admin);
	}

}
