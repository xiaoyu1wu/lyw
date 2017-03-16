package com.lyw.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyw.domain.TbAdmin;
import com.lyw.domain.TbUser;
import com.lyw.service.AdminService;
import com.lyw.service.UserService;

import junit.framework.TestCase;

public class UserTest  extends TestCase{
	@Test
	public void testFindUser() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		UserService userService = (UserService) ac.getBean("userService");
		int userId = userService.findUserIdByUsername("刘si");
		assertEquals(-1, userId);
		userId = userService.findUserIdByUsername("刘诗诗");
		assertEquals(2, userId);
	}
	
	@Test
	public void testFindUserByUsernameAndPassword() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		UserService userService = (UserService) ac.getBean("userService");
		int userId = userService.findUserIdByUsernameAndPassword("刘si", "983ddc672f511c3aeebcd99653d49e34");
		assertEquals(-1, userId);
		userId = userService.findUserIdByUsernameAndPassword("刘诗诗", "993ddc672f511c3aeebcd99653d49e34");
		assertEquals(2, userId);
	}
	
	@Test
	public void testSaveUser() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_mybatis.xml");
		UserService userService = (UserService) ac.getBean("userService");
		TbUser user = new TbUser();
		user.setUserName("我的");
		user.setUserPassword("993dcc672f511c3aeebcd99653d49e34");
		user.setUserEmail("49849166@qq.com");
		int userId = userService.saveUser(user);
		assertEquals(1, userId);
		
		userId = userService.findUserIdByUsernameAndPassword("刘诗诗", "993ddc672f511c3aeebcd99653d49e34");
		assertEquals(2, userId);
		
		String sizer = "993ddc672f511c3aeebcd99653d49e34";
		System.out.println(sizer.length());
	}
}
