package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;


public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer user_id;
	private String userNumber;
	private String username;
	private String password;
	
	private UserMessage userMessage; 	//�����û���ϸ��Ϣ
	private List<Role> roles = new ArrayList<>();					//�û���ɫ
 	private List<EquipmentRent> equipmentRents = new ArrayList<>(); //����
 	private List<GroundRent> groundRents = new ArrayList<>();		//����
 	private List<AnnounceComment> announceComments = new ArrayList<>();//��������
 	private List<Announcement> announcements = new ArrayList<>(); 	//����
	private List<GameApply> gameApplies = new ArrayList<>();
	
	
	public User() {
	}
	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", userNumber=" + userNumber + ", username=" + username + ", password="
				+ password + ", userMessage=" + userMessage + ", roles=" + roles + ", equipmentRents=" + equipmentRents
				+ ", groundRents=" + groundRents + ", announceComments=" + announceComments + ", announcements="
				+ announcements + ", gameApplies=" + gameApplies + "]";
	}





	public String getUserNumber() {
		return userNumber;
	}


	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}


	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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
	public UserMessage getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(UserMessage userMessage) {
		this.userMessage = userMessage;
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<EquipmentRent> getEquipmentRents() {
		return equipmentRents;
	}
	public void setEquipmentRents(List<EquipmentRent> equipmentRents) {
		this.equipmentRents = equipmentRents;
	}
	public List<GroundRent> getGroundRents() {
		return groundRents;
	}
	public void setGroundRents(List<GroundRent> groundRents) {
		this.groundRents = groundRents;
	}
	public List<AnnounceComment> getAnnounceComments() {
		return announceComments;
	}
	public void setAnnounceComments(List<AnnounceComment> announceComments) {
		this.announceComments = announceComments;
	}
	public List<Announcement> getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}
	public List<GameApply> getGameApplies() {
		return gameApplies;
	}
	public void setGameApplies(List<GameApply> gameApplies) {
		this.gameApplies = gameApplies;
	}
	
	
	
	public User(Integer user_id, String userNumber, String username, String password) {
		super();
		this.user_id = user_id;
		this.userNumber = userNumber;
		this.username = username;
		this.password = password;
	}

	

	
	public User(Integer user_id, String username, String password) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
	}


	public User(String userNumber, String username, String password) {
		super();
		this.userNumber = userNumber;
		this.username = username;
		this.password = password;
	}
	
	
}
