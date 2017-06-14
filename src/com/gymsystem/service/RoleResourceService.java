package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.AuthorityVo;
import com.gymsystem.vo.RoleResourceVo;

public interface RoleResourceService {

	/**
	 *	添加用户对应的可访问的资源
	 * 
	 * @param authorityVo
	 * @return
	 */
	public boolean addRoleResource(RoleResourceVo roleResourceVo);
	
	
	public boolean deleteRoleResource(RoleResourceVo roleResourceVo);
	
	
	public boolean updateRoleResource(RoleResourceVo roleResourceVo);
	
	
	public List<RoleResourceVo> getRoleResources();
	
	
	public RoleResourceVo getRoleResourceByNumber(String roleResourceNumber);
	
	
	public List<RoleResourceVo> getRoleResoruceByRoleNumber(String RoleNumber);

	
	public boolean updateRoleResource(String[]resourceNumbers,String roleNumber);
	
	
	
	
}








