package com.gymsystem.vo;

public class RoleVo {

	private String RoleNumber;
	private String userNumber;
	private String roleName;
	private String description;
	
	public RoleVo() {
		// TODO Auto-generated constructor stub
	}

	

	public RoleVo(String roleNumber, String userNumber, String roleName, String description) {
		super();
		RoleNumber = roleNumber;
		this.userNumber = userNumber;
		this.roleName = roleName;
		this.description = description;
	}



	public String getRoleNumber() {
		return RoleNumber;
	}

	public void setRoleNumber(String roleNumber) {
		RoleNumber = roleNumber;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserNumber() {
		return userNumber;
	}
	
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	@Override
	public String toString() {
		return "RoleVo [RoleNumber=" + RoleNumber + ", userNumber=" + userNumber + ", roleName=" + roleName
				+ ", description=" + description + "]";
	}
	
	
}
