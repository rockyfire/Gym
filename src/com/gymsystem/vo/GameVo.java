package com.gymsystem.vo;

import java.util.Date;

public class GameVo {

	private String gameNumber;
	private String location;	//比赛场地
	private String groundNumber;
	private String equipmentNumber;
	private String equipment;
	private Date   gameTime;	//比赛时间
	private String gameName;
	private String gameType;
	private String description;
	private String enterprise;
	private String gameLevel;		//校级比赛
	private String verify;			//审核
	
	
	public GameVo() {
		// TODO Auto-generated constructor stub
	}


	


	public GameVo(String gameNumber, String location, String groundNumber, String equipmentNumber, String equipment,
			Date gameTime, String gameName, String gameType, String description, String enterprise, String gameLevel,
			String verify) {
		super();
		this.gameNumber = gameNumber;
		this.location = location;
		this.groundNumber = groundNumber;
		this.equipmentNumber = equipmentNumber;
		this.equipment = equipment;
		this.gameTime = gameTime;
		this.gameName = gameName;
		this.gameType = gameType;
		this.description = description;
		this.enterprise = enterprise;
		this.gameLevel = gameLevel;
		this.verify = verify;
	}





	public String getGroundNumber() {
		return groundNumber;
	}





	public void setGroundNumber(String groundNumber) {
		this.groundNumber = groundNumber;
	}





	public String getEquipmentNumber() {
		return equipmentNumber;
	}





	public void setEquipmentNumber(String equipmentNumber) {
		this.equipmentNumber = equipmentNumber;
	}





	public String getEquipment() {
		return equipment;
	}





	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}





	public String getGameNumber() {
		return gameNumber;
	}


	public void setGameNumber(String gameNumber) {
		this.gameNumber = gameNumber;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getGameTime() {
		return gameTime;
	}


	public void setGameTime(Date gameTime) {
		this.gameTime = gameTime;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameType() {
		return gameType;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEnterprise() {
		return enterprise;
	}


	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}


	public String getGameLevel() {
		return gameLevel;
	}


	public void setGameLevel(String gameLevel) {
		this.gameLevel = gameLevel;
	}


	public String getVerify() {
		return verify;
	}


	public void setVerify(String verify) {
		this.verify = verify;
	}

	@Override
	public String toString() {
		return "GameVo [gameNumber=" + gameNumber + ", location=" + location + ", groundNumber=" + groundNumber
				+ ", equipmentNumber=" + equipmentNumber + ", equipment=" + equipment + ", gameTime=" + gameTime
				+ ", gameName=" + gameName + ", gameType=" + gameType + ", description=" + description + ", enterprise="
				+ enterprise + ", gameLevel=" + gameLevel + ", verify=" + verify + "]";
	}


	
}
