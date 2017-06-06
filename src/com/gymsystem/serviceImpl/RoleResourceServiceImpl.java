package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.RoleDao;
import com.gymsystem.dao.RoleResourceDao;
import com.gymsystem.po.Role;
import com.gymsystem.po.RoleResource;
import com.gymsystem.service.RoleResourceService;
import com.gymsystem.vo.AuthorityVo;
import com.gymsystem.vo.RoleResourceVo;


@Service("roleResourceServiceImpl")
public class RoleResourceServiceImpl implements RoleResourceService{

	@Resource
	private RoleResourceDao roleResourceDao;
	@Resource
	private RoleDao roleDao;
	

	@Override
	public boolean addRoleResource(RoleResourceVo roleResourceVo) {
		RoleResource roleResource = new RoleResource();
		
		roleResource.setDescript(roleResourceVo.getDescription());
		roleResource.setResourceName(roleResourceVo.getRoleResourceName());
		roleResource.setRoleResourceNumber(roleResourceVo.getRoleResoruceNumber());
		try {
			roleResourceDao.save(roleResource);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteRoleResource(RoleResourceVo roleResourceVo) {
		RoleResource roleResource = roleResourceDao.getRoleResourceByNumber(roleResourceVo.getRoleNumber());
		try {
			if (roleResource!=null) {
				roleResourceDao.delete(roleResource.getRoleResource_id());
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateRoleResource(RoleResourceVo roleResourceVo) {
		RoleResource roleResource = roleResourceDao.getRoleResourceByNumber(roleResourceVo.getRoleNumber());
		roleResource.setDescript(roleResourceVo.getDescription());
		roleResource.setResourceName(roleResource.getResourceName());
		roleResource.setRoleResourceNumber(roleResourceVo.getRoleResoruceNumber());
		try {
			roleResourceDao.update(roleResource);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<RoleResourceVo> getRoleResources() {
		List<RoleResource> roleResources = roleResourceDao.query();
		List<RoleResourceVo>roleResourceVos = new ArrayList<>();
		
		for(RoleResource roleResource:roleResources){
			RoleResourceVo roleResourceVo = new RoleResourceVo();
			roleResourceVo.setDescription(roleResource.getDescript());
			roleResourceVo.setRoleResourceName(roleResource.getResourceName());
			roleResourceVo.setRoleResoruceNumber(roleResource.getRoleResourceNumber());
			
			roleResourceVos.add(roleResourceVo);
		}
		System.out.println("getRoleResources");
		System.out.println(roleResourceVos.toString());
		return roleResourceVos;
	}

	@Override
	public RoleResourceVo getRoleResourceByNumber(String roleResourceNumber) {
		RoleResource roleResource = roleResourceDao.getRoleResourceByNumber(roleResourceNumber);
		RoleResourceVo roleResourceVo = new RoleResourceVo();
		
		roleResourceVo.setDescription(roleResource.getDescript());
		roleResourceVo.setRoleNumber(roleResource.getRoleResourceNumber());
		roleResourceVo.setRoleResourceName(roleResource.getResourceName());
		
		return roleResourceVo;
	}

	@Override
	public List<RoleResourceVo> getRoleResoruceByRoleNumber(String roleNumber) {
		
		List<RoleResource> roleResources = roleResourceDao.query();
		List<RoleResourceVo>roleResourceVos = new ArrayList<>();
		List<Role>roles=new ArrayList<>();
		for(RoleResource roleResource:roleResources){
			RoleResourceVo roleResourceVo = new RoleResourceVo();
			roleResourceVo.setDescription(roleResource.getDescript());
			roleResourceVo.setRoleResourceName(roleResource.getResourceName());
			roleResourceVo.setRoleResoruceNumber(roleResource.getRoleResourceNumber());
			
			roles = roleResource.getRoles();
			for(Role role : roles){
				if (roleNumber.equals(role.getRoleNumber())) {
					roleResourceVo.setRoleNumber(roleNumber);
					roleResourceVo.setRoleName(role.getRoleName());
				}
			}
			roleResourceVos.add(roleResourceVo);
		}
		
		return roleResourceVos;
	}

	@Override
	public boolean updateRoleResource(String[] resourceNumbers, String roleNumber) {
		
		try {
			for (int i = 0; i < resourceNumbers.length; i++) {
				Role role = roleDao.getRoleByNumber(roleNumber);
				List<RoleResource> roleResources = role.getRoleResources();
//				for(RoleResource roleResource:roleResources){
//					System.out.println(roleResource.getResourceName());
//				}
				System.out.println("拥有资源数         "+role.getRoleResources().size());
				RoleResource roleResource = roleResourceDao.getRoleResourceByNumber(resourceNumbers[i]);
				role.getRoleResources().add(roleResource);
				roleResource.getRoles().add(role);
				roleDao.update(role);
				roleResourceDao.update(roleResource);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
