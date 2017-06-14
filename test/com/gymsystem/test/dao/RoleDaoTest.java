package com.gymsystem.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gymsystem.dao.RoleDao;
import com.gymsystem.po.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
	"classpath:applicationContext-beans.xml"})
public class RoleDaoTest {

	@Resource
	private RoleDao roleDao;
	
	
	@Test
	public void testGetRoleByName(){
		Role rolee  = roleDao.getRoleByName("abd");
		if (rolee!=null) {
			System.out.println(rolee.getRole_id()+"---------");
		}else{
			System.out.println("没有该角色");
		}
	}
	
	@Test
	public void testGetRoles(){
		List<Role>roles = roleDao.query();
		for(Role role : roles){
			System.out.println(role.getRoleName());
		}
	}
	
	@Test
	public void testGetById(){
		Role role = roleDao.get(2);
		System.out.println(role.getRoleName());
		
	}
	
	@Test
	public void testSaveRole(){
		Role role = new Role("泡影时代", "123");
		roleDao.save(role);
	}
	
	
	@Test
	public void testDelete(){
		roleDao.delete(1);
	}
	
	
	@Test
	public void testUpdate(){
		Role role = roleDao.get(2);
		role.setRoleName("泡影时代");
		roleDao.update(role);
	}
	
}











