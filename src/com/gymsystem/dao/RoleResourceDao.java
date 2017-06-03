package com.gymsystem.dao;

import com.gymsystem.po.RoleResource;

public interface RoleResourceDao extends BaseDao<RoleResource> {

	public RoleResource getRoleResourceByNumber(String roleResourceNumber);
	
	public RoleResource getRoleResourceByName(String roleResourceName);
	
	
}
