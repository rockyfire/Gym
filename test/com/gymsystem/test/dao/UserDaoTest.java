package com.gymsystem.test.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gymsystem.dao.UserDao;
import com.gymsystem.dao.UserMessageDao;
import com.gymsystem.po.Role;
import com.gymsystem.po.User;
import com.gymsystem.po.UserMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
	"classpath:applicationContext-beans.xml"})
public class UserDaoTest {

	@Resource(name="userDaoImpl")
	private UserDao userDao;
	
	@Resource(name="userMessageDaoImpl")
	private UserMessageDao userMessageDao;
	
	
	
	@Test
	public void testGetByNumber(){
		User user = userDao.getUserByNumber("123");
		if (user!=null) {
			System.out.println(user.getUsername()+"-------------------");
		}else{
			System.out.println("user is null");
		}
	}
	
	
	@Test
	public void testSave(){
		userDao.addUser(new User(1,"testUnit", "test"));
	}
	
	
	@Test
	public void testAddUserMessage(){
		UserMessage message = new UserMessage();
		message.set_class("sd");
		message.setAddress("user113");
		message.setAge("113");
		message.setUserNumber("213");
		message.setBornDay(new Date());
		message.setIDNumber("sdf");
		
		User user = userDao.getUserByNumber("113");
		
//		userMessageDao.save(message);
		user.setUserMessage(message);
		userDao.update(user);
	}
	
	
	@Test
	public void testGetUserMessage(){
		
		User user = userDao.getUserByNumber("113");
		
		UserMessage userMessage=user.getUserMessage();
		
		if (userMessage!=null) {
			System.out.println("userMessage is not null");
		}else{
			System.out.println("usermessage is null");
		}
		
		
	}
	
	
	@Test
	public void testGet(){
		User user = userDao.getUserByName("c");
		System.out.println(user.getUsername());
	}
	
	@Test
	public void testGetAuthority(){
		User user = userDao.getUserByNumber("123");
		List<Role> roles = user.getRoles();
		for(Role role: roles){
			System.out.println(role.getRoleNumber());
		}
	}
	
	
}
