package com.gymsystem.action;

import java.util.List;

import javax.annotation.Resource;

import com.gymsystem.po.Role;
import com.gymsystem.service.RoleService;
import com.gymsystem.service.UserService;
import com.gymsystem.vo.RoleVo;
import com.gymsystem.vo.UserVo;

public class RoleAction extends BaseAction<RoleVo>{

	
	@Resource
	private UserService userService;
	@Resource
	private RoleService roleService;
	
	private String userNumber;
	private UserVo userVo;
	//用来接收页面的checkbox的值
	private String[] roleNumbers;
	
	
	
	public String updateUserRoles(){
		userService.updateUserAuthority(roleNumbers, userNumber);
		return "updateUserRoles_success";
	}
	
	
	public String getUserRoles(){
		list = roleService.getRoles(userNumber);
		request.put("roles", list);
		return "getUserRoles_success";
	}
	
	
	public String toUserAuthority(){
		
		
		return "userAuthority";
	}
	
	
	
	
	public UserVo getUserVo() {
		return userVo;
	}
	
	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}
	
	
	public String getUserNumber() {
		return userNumber;
	}
	
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	@Override
	public List<RoleVo> getList() {
		return super.getList();
	}
}
