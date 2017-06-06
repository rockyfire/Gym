package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Role implements Serializable{

	private Integer role_id;
	private String roleName;
	private String roleNumber;
	private String description;
	
	private List<RoleResource> roleResources 		//���Ӷ����Դ
			= new ArrayList<>();	
	private List<User> users = new ArrayList<>();	//һ����ɫ������û�����
	
	public Role() {
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", roleName=" + roleName + ", roleNumber=" + roleNumber + ", description="
				+ description + ", roleResources=" + roleResources + ", users=" + users + "]";
	}


	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
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

	public Role(String roleName, String roleNumber, String description) {
		super();
		this.roleName = roleName;
		this.roleNumber = roleNumber;
		this.description = description;
	}
	
}
