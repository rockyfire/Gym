package com.gymsystem.service;

import com.gymsystem.vo.AuthorityVo;

public interface RoleResourceService {

	/**
	 *	添加用户对应的可访问的资源
	 * 
	 * @param authorityVo
	 * @return
	 */
	public boolean addRoleResource(AuthorityVo authorityVo);
	
	
}
