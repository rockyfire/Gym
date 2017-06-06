package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.AuthorityVo;
import com.gymsystem.vo.RoleVo;

public interface RoleService {

	public List<RoleVo> getRoles();
	
	public List<RoleVo> getRoles(String userNumber);
	
	public boolean addRole(RoleVo roleVo);
	
	public boolean updateRole(RoleVo roleVo);
	
	public boolean deleteRole(RoleVo roleVo);
	
	public RoleVo getRoleByNumber(String roleNumber);
	/**
	 * 
	 * 获取角色资源
	 * @return
	 */
	public List<AuthorityVo> getResources(String roleNumber);
	
}
