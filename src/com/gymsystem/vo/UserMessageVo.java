package com.gymsystem.vo;

import java.util.Date;

public class UserMessageVo {

	private String userNubmer;
	private String name;
	private String location;
	private Date   bornDate;
	private String IDNumber;
	private String studentId;
	private String email;
	private String grade;
	
	public UserMessageVo() {
		// TODO Auto-generated constructor stub
	}

	public UserMessageVo(String userNubmer, String name, String location, Date bornDate, String iDNumber,
			String studentId, String email, String grade) {
		super();
		this.userNubmer = userNubmer;
		this.name = name;
		this.location = location;
		this.bornDate = bornDate;
		IDNumber = iDNumber;
		this.studentId = studentId;
		this.email = email;
		this.grade = grade;
	}

	public String getUserNubmer() {
		return userNubmer;
	}

	public void setUserNubmer(String userNubmer) {
		this.userNubmer = userNubmer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "UserMessageVo [userNubmer=" + userNubmer + ", name=" + name + ", location=" + location + ", bornDate="
				+ bornDate + ", IDNumber=" + IDNumber + ", studentId=" + studentId + ", email=" + email + ", grade="
				+ grade + "]";
	}
	
	
}
