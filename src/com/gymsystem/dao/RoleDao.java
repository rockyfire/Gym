package com.gymsystem.dao;

import com.gymsystem.po.Role;

public interface RoleDao extends BaseDao<Role> {

	public Role getRoleByName(String roleName);
	
	public Role getRoleByNumber(String roleNumber);
	
	
}
