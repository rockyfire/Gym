package com.gymsystem.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.gymsystem.po.Role;
import com.gymsystem.service.RoleService;
import com.gymsystem.service.UserService;
import com.gymsystem.vo.RoleResourceVo;
import com.gymsystem.vo.RoleVo;
import com.gymsystem.vo.UserVo;

public class RoleAction extends BaseAction<RoleVo>{
	private String userNumber;
	private UserVo userVo;
	private RoleVo roleVo;
	private RoleResourceVo roleResourceVo;
	
	//用来接收页面的checkbox的值
	private String[] roleNumbers;
	//接收页面 角色资源编号的数组
	private String[] resourceNumbers;
	private List<RoleResourceVo> roleResourceVos;
	
	//新增资源
	public String addResource(){
		
		
		return "addResource_success";
	}

	//更改角色资源
	public String updateRoleResources(){ 
		roleResourceService.updateRoleResource(resourceNumbers, roleVo.getRoleNumber());
		return "updateRoleResources_success";
	}
	
	
	
	//初始化角色管理页面
	public String toRoleResource(){
		roleResourceVos = roleResourceService.getRoleResoruceByRoleNumber(roleVo.getRoleNumber());
		String roleName = roleService.getRoleByNumber(roleVo.getRoleNumber()).getRoleName();
		request.put("resources", roleResourceVos);
		request.put("roleName",roleName);
		request.put("roleNumber", roleVo.getRoleNumber());
		return "toRoleResource_success";
	}
	
	
	public String toRoleManage(){
		list = roleService.getRoles();
		request.put("roles", list);
		System.out.println(list.toString());
		return "toRoleManage_success";
	}
	             
	
	public String addRole(){
		roleService.addRole(roleVo);
		return "addRole_success";
	}
	
	
	public String deleteRole(){
		roleService.deleteRole(roleVo);
		return "deleteRole_success";
	}
	
	
	public String updateRole(){
		roleService.updateRole(roleVo);
		return "updateRole_success";
	}
	
	
	
	public String getRole(){
		this.roleVo = roleService.getRoleByNumber(roleVo.getRoleNumber());
		System.out.println(this.roleVo.toString());
		
		return "getRole_success";
	}
	
	
	public String updateUserRoles(){
		System.out.println("userNumber"+userNumber);
		for (int i = 0; i < roleNumbers.length; i++) {
			System.out.println(roleNumbers[i]+"----------------");
		}
		userService.updateUserAuthority(roleNumbers, userNumber);
		return "updateUserRoles_success";
	}
	
	
	
	public String getUserRoles(){
		System.out.println(userNumber);
		list = roleService.getRoles(userNumber);
		System.out.println("roleActioin list" + list.toString());
		request.put("roles", list);
		return "getUserRoles_success";
	}
	
	
	
	public String toUserAuthority(){
		return "userAuthority";
	}
	
	
	public RoleVo getRoleVo() {
		return roleVo;
	}
	
	public void setRoleVo(RoleVo roleVo) {
		this.roleVo = roleVo;
	}
	
	public String[] getRoleNumbers() {
		return roleNumbers;
	}
	
	public void setRoleNumbers(String[] roleNumbers) {
		this.roleNumbers = roleNumbers;
	}
	
	public String[] getResourceNumbers() {
		return resourceNumbers;
	}
	
	public void setResourceNumbers(String[] resourceNumbers) {
		this.resourceNumbers = resourceNumbers;
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
	
	public List<RoleResourceVo> getRoleResourceVos() {
		return roleResourceVos;
	}
}
