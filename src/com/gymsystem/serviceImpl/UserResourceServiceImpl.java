package com.gymsystem.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.RoleResourceDao;
import com.gymsystem.po.RoleResource;
import com.gymsystem.service.RoleResourceService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.AuthorityVo;

@Service("roleResourceServiceImpl")
public class UserResourceServiceImpl implements RoleResourceService{

	
	@Resource
	private RoleResourceDao roleResouceDao;
	
	@Override
	public boolean addRoleResource(AuthorityVo authorityVo) {
		RoleResource roleResource = new RoleResource();
		
		roleResource.setResourceName(authorityVo.getAuthorityName());
		roleResource.setRoleResourceNumber(MyUtil.createUserNumber());
		roleResource.setDescript(authorityVo.getDescription());
		
		try {
			roleResouceDao.save(roleResource);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
