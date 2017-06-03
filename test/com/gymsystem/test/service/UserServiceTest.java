package com.gymsystem.test.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gymsystem.po.User;
import com.gymsystem.service.UserService;
import com.gymsystem.vo.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
	"classpath:applicationContext-beans.xml"})
public class UserServiceTest {

	@Resource(name="userServiceImpl")
	UserService userService;
	
	
	@Test
	public void testAuthority(){
		UserVo userVo = new UserVo();
		userVo.setUserNubmer("123");
		String[] roleNumbers = {"112","113","111"};
		userService.updateUserAuthority(roleNumbers, userVo.getUserNubmer());
	}
	
	
	@Test
	public void testGetAuthority(){
		
		
		
	}
	
	
}
