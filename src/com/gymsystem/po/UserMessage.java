package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * �û���ϸ��Ϣ
 * 
 * @author e.IT
 *
 */
public class UserMessage implements Serializable{

	private Integer userMessage_id;
	
	private String userNumber;
	private String username;
	private String address;
	private String sex;
	private Date   bornDay;  		//��������
	private String IDNumber;	//��ݺ�
	private String age;
	private String schoolName;
	private String grade;
	private String _class;
	private String phoneNumber;
	private String eMail;
	
	private User user;

	public UserMessage() {
		// TODO Auto-generated constructor stub
	}
	

	
	
	@Override
	public String toString() {
		return "UserMessage [userMessage_id=" + userMessage_id + ", userNumber=" + userNumber + ", username=" + username
				+ ", address=" + address + ", sex=" + sex + ", bornDay=" + bornDay + ", IDNumber=" + IDNumber + ", age="
				+ age + ", schoolName=" + schoolName + ", grade=" + grade + ", _class=" + _class + ", phoneNumber="
				+ phoneNumber + ", eMail=" + eMail + ", user=" + "]";
	}





	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public Integer getUserMessage_id() {
		return userMessage_id;
	}

	public void setUserMessage_id(Integer userMessage_id) {
		this.userMessage_id = userMessage_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBornDay() {
		return bornDay;
	}

	public void setBornDay(Date bornDay) {
		this.bornDay = bornDay;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserMessage(String userNumber, String username, String address, String sex, Date bornDay, String iDNumber,
			String age, String schoolName, String grade, String _class, String phoneNumber, String eMail) {
		super();
		this.userNumber = userNumber;
		this.username = username;
		this.address = address;
		this.sex = sex;
		this.bornDay = bornDay;
		IDNumber = iDNumber;
		this.age = age;
		this.schoolName = schoolName;
		this.grade = grade;
		this._class = _class;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}

	
}
