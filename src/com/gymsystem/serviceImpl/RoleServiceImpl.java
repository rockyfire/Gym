package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.RoleDao;
import com.gymsystem.dao.UserDao;
import com.gymsystem.po.Role;
import com.gymsystem.po.RoleResource;
import com.gymsystem.po.User;
import com.gymsystem.service.RoleService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.AuthorityVo;
import com.gymsystem.vo.RoleVo;

@Service("roleServiceImpl")
public class RoleServiceImpl implements RoleService{

	@Resource
	private RoleDao roleDao;
	@Resource
	private UserDao userDao;
	
	@Override
	public RoleVo getRoleByNumber(String roleNumber) {
		Role role = roleDao.getRoleByNumber(roleNumber);
		RoleVo roleVo = new RoleVo();
		if (role!=null) {
			roleVo.setRoleName(role.getRoleName());
			roleVo.setRoleNumber(role.getRoleNumber());
			roleVo.setDescription(role.getDescription());
			return roleVo;
		}else {
			return null;
		}
	}
	
	
	@Override
	public List<RoleVo> getRoles() {

		try {
			List<RoleVo> roleVos = new ArrayList<>();
			List<Role>roles = roleDao.query();
			System.out.println("roles size is "+ roles.size());
			for(Role role:roles){
				RoleVo roleVo = new RoleVo();
				roleVo.setRoleName(role.getRoleName());
				roleVo.setRoleNumber(role.getRoleNumber());
				roleVo.setDescription(role.getDescription());
				roleVos.add(roleVo);
			}
			System.out.println(roleVos.toString());
			return roleVos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	@Override
	public List<RoleVo> getRoles(String userNumber) {
		System.out.println("roleServiceImpl userNumber is "+ userNumber);
		try {
			List<RoleVo> roleVos = new ArrayList<>();
			List<Role>roles = roleDao.query();
			System.out.println("roles size is "+ roles.size());
			for(Role role:roles){
				RoleVo roleVo = new RoleVo();
				roleVo.setRoleName(role.getRoleName());
				roleVo.setRoleNumber(role.getRoleNumber());
				
				List<User>users = role.getUsers();
				
				System.out.println("users.size() is "+users.size());
				
				
				for(User user1:users){
					if (user1!=null) {
						if (userNumber.equals(user1.getUserNumber())) {
							roleVo.setUserNumber(userNumber);
						}
					}
				}
				
				System.out.println("userNumber   "+roleVo.getUserNumber());
				roleVos.add(roleVo);
			}
			System.out.println(roleVos.toString());
			return roleVos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public boolean addRole(RoleVo roleVo) {
		Role role = new Role();
		role.setRoleName(roleVo.getRoleName());
		role.setRoleNumber(MyUtil.createUserNumber());
		try {
			roleDao.save(role);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	
	@Override
	public boolean updateRole(RoleVo roleVo) {
		Role role = roleDao.getRoleByNumber(roleVo.getRoleNumber());
		if (role!=null) {
			try {
			role.setRoleName(roleVo.getRoleName());
			role.setDescription(roleVo.getDescription());
			roleDao.update(role);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		}else{
			return false;
		}
	}

	@Override
	public boolean deleteRole(RoleVo roleVo) {
		Role role = roleDao.getRoleByNumber(roleVo.getRoleNumber());
		List<User> users = role.getUsers();
		
		for(User user:users){
			user.getRoles().remove(role);
			userDao.update(user);
		}
		
		if (role!=null) {
			try {
				roleDao.delete(role.getRole_id());
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}else{
			return false;
		}
	}

	@Override
	public List<AuthorityVo> getResources(String roleNumber) {
		Role role1 = roleDao.getRoleByNumber(roleNumber);
		List<RoleResource>roleResources = role1.getRoleResources();
		List<AuthorityVo> authorityVos = new ArrayList<>();
		for(RoleResource roleResource: roleResources){
			AuthorityVo authorityVo = new AuthorityVo();
			authorityVo.setAuthorityName(roleResource.getResourceName());
			authorityVo.setAuthorityNumber(roleResource.getRoleResourceNumber());
			authorityVo.setDescription(roleResource.getDescript());
			authorityVos.add(authorityVo);
		}		
		return authorityVos;
	}
	
}
