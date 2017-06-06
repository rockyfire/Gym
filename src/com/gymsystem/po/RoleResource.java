package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;

public class RoleResource implements Serializable{

	private Integer roleResource_id;
	private String roleResourceNumber;
	private String ResourceName;	//可到达的资源路径
	private String descript; 		//资源描述
	
	private List<Role> roles = new ArrayList<>();

	public RoleResource() {
	}
	
	

	@Override
	public String toString() {
		return "RoleResource [roleResource_id=" + roleResource_id + ", roleResourceNumber=" + roleResourceNumber
				+ ", ResourceName=" + ResourceName + ", descript=" + descript + ", roles=" + roles + "]";
	}



	public Integer getRoleResource_id() {
		return roleResource_id;
	}

	public void setRoleResource_id(Integer roleResource_id) {
		this.roleResource_id = roleResource_id;
	}

	public String getResourceName() {
		return ResourceName;
	}

	public void setResourceName(String resourceName) {
		ResourceName = resourceName;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	
	public String getRoleResourceNumber() {
		return roleResourceNumber;
	}

	public void setRoleResourceNumber(String roleResourceNumber) {
		this.roleResourceNumber = roleResourceNumber;
	}

	public RoleResource(String roleResourceNumber, String resourceName, String descript) {
		super();
		this.roleResourceNumber = roleResourceNumber;
		ResourceName = resourceName;
		this.descript = descript;
	}

	
}
