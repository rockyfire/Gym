package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.RoleDao;
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
	
	@Override
	public List<RoleVo> getRoles(String userNumber) {
		try {
			List<RoleVo> roleVos = new ArrayList<>();
			List<Role>roles = roleDao.query();
			for(Role role:roles){
				RoleVo roleVo = new RoleVo();
				roleVo.setRoleName(role.getRoleName());
				roleVo.setRoleNumber(role.getRoleNumber());
				
				List<User>users = role.getUsers();
				for(User user1:users){
					if (userNumber.equals(user1.getUserNumber())) {
						roleVo.setUserNumber(userNumber);
					}
				}
				roleVos.add(roleVo);
			}
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
