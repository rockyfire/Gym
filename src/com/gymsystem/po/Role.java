package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Role implements Serializable{

	private Integer role_id;
	private String roleName;
	private String roleNumber;
	
	private List<RoleResource> roleResources 		//连接多个资源
			= new ArrayList<>();	
	private List<User> users = new ArrayList<>();	//一个角色被多个用户引用
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", roleName=" + roleName + ", roleNumber=" + roleNumber + ", roleResources="
				+ roleResources + ", users=" + users + "]";
	}



	public String getRoleNumber() {
		return roleNumber;
	}

	public void setRoleNumber(String roleNumber) {
		this.roleNumber = roleNumber;
	}

	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<RoleResource> getRoleResources() {
		return roleResources;
	}
	public void setRoleResources(List<RoleResource> roleResources) {
		this.roleResources = roleResources;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Role(String roleName, String roleNumber) {
		super();
		this.roleName = roleName;
		this.roleNumber = roleNumber;
	}
	
	
}
