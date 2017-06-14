package com.gymsystem.test.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gymsystem.dao.RoleDao;
import com.gymsystem.dao.UserDao;
import com.gymsystem.po.Role;
import com.gymsystem.po.User;
import com.gymsystem.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
	"classpath:applicationContext-beans.xml"})
public class RoleServiceTest {

	@Resource
	private RoleService roleService;
	@Resource
	private RoleDao roleDao;
	@Resource
	private UserDao userDao;
	@Test
	public void testAddRole(){
		Role role = new Role();
		role.setRoleName("场地管理员");
		role.setRoleNumber("123");
		roleDao.save(role);
		
	}
	
	
	@Test
	public void testAddUserRole(){
		Role role = roleDao.getRoleByNumber("123");
		User user = userDao.getUserByNumber("123");
		
		user.getRoles().add(role);
		
		userDao.update(user);
	}
	
	
	@Test
	public void testGetUserRole(){
		
	}
	
	
}














