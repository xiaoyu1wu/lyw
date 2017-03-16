package com.lyw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyw.domain.TbAdmin;
import com.lyw.domain.TbRecruit;
import com.lyw.service.AdminService;
import com.lyw.service.RecruitService;

public class RecruitTest {

	@Test
	public void testFindRecruits() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		RecruitService recruitService = (RecruitService) ac.getBean("recruitService");
		List<TbRecruit> recruits = recruitService.findJobByRecrJob("软件");
		System.out.println(recruits);
	}


}
