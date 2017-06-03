package com.gymsystem.vo;

public class AuthorityVo {

	private String authorityNumber;
	private String authorityName;
	private String authorityLevel;
	private String description;
	
	public AuthorityVo() {
		// TODO Auto-generated constructor stub
	}
	
	public AuthorityVo(String authorityNumber, String authorityName, String authorityLevel, String description) {
		super();
		this.authorityNumber = authorityNumber;
		this.authorityName = authorityName;
		this.authorityLevel = authorityLevel;
		this.description = description;
	}
	public String getAuthorityNumber() {
		return authorityNumber;
	}
	public void setAuthorityNumber(String authorityNumber) {
		this.authorityNumber = authorityNumber;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getAuthorityLevel() {
		return authorityLevel;
	}
	public void setAuthorityLevel(String authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "AuthorityVo [authorityNumber=" + authorityNumber + ", authorityName=" + authorityName
				+ ", authorityLevel=" + authorityLevel + ", description=" + description + "]";
	}
	
	
}
