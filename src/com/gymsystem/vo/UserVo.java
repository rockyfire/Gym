package com.gymsystem.vo;

import java.util.Date;

public class UserVo {

	private String username;
	private String password;
	
	private String userNubmer;
	private String name;
	private String location;
	private Date   bornDate;
	private String IDNumber;
	private String studentId;
	private String email;
	private String grade;
	
	public UserVo() {
	}


	public UserVo(String username, String password, String userNubmer, String name, String location, Date bornDate,
			String iDNumber, String studentId, String email, String grade) {
		super();
		this.username = username;
		this.password = password;
		this.userNubmer = userNubmer;
		this.name = name;
		this.location = location;
		this.bornDate = bornDate;
		IDNumber = iDNumber;
		this.studentId = studentId;
		this.email = email;
		this.grade = grade;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "UserVo [username=" + username + ", password=" + password + ", userNubmer=" + userNubmer + ", name="
				+ name + ", location=" + location + ", bornDate=" + bornDate + ", IDNumber=" + IDNumber + ", studentId="
				+ studentId + ", email=" + email + ", grade=" + grade + "]";
	}

	
	
}
