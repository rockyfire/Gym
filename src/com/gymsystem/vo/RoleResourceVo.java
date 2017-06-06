package com.gymsystem.vo;

public class RoleResourceVo {

	private String roleResoruceNumber;
	private String roleResourceName;
	private String roleNumber;			//”√ªß±‡∫≈
	private String roleName;
	private String description;
	private String level;
	
	
	public RoleResourceVo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public RoleResourceVo(String roleResoruceNumber, String roleResourceName, String roleNumber, String roleName,
			String description, String level) {
		super();
		this.roleResoruceNumber = roleResoruceNumber;
		this.roleResourceName = roleResourceName;
		this.roleNumber = roleNumber;
		this.roleName = roleName;
		this.description = description;
		this.level = level;
	}




	@Override
	public String toString() {
		return "RoleResourceVo [roleResoruceNumber=" + roleResoruceNumber + ", roleResourceName=" + roleResourceName
				+ ", roleNumber=" + roleNumber + ", roleName=" + roleName + ", description=" + description + ", level="
				+ level + "]";
	}

	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleResoruceNumber() {
		return roleResoruceNumber;
	}
	public void setRoleResoruceNumber(String roleResoruceNumber) {
		this.roleResoruceNumber = roleResoruceNumber;
	}
	public String getRoleResourceName() {
		return roleResourceName;
	}
	public void setRoleResourceName(String roleResourceName) {
		this.roleResourceName = roleResourceName;
	}
	public String getRoleNumber() {
		return roleNumber;
	}
	public void setRoleNumber(String roleNumber) {
		this.roleNumber = roleNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
}
