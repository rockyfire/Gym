package com.gymsystem.vo;

import java.util.Date;

public class GroundRentVo {

	private String groundNumber;
	private String groundRentNumber;
	private String description;			//使用情况描述
	private Date   rentTime;
	private Date   returnTime;
	private String leaseHolder;			//租借人 
	private long rentRate;
	private String location;
	private boolean canUser;
	private String type;
	
	
	public GroundRentVo() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public GroundRentVo(String groundNumber, String groundRentNumber, String description, Date rentTime,
			Date returnTime, String leaseHolder, long rentRate, String location, boolean canUser, String type) {
		super();
		this.groundNumber = groundNumber;
		this.groundRentNumber = groundRentNumber;
		this.description = description;
		this.rentTime = rentTime;
		this.returnTime = returnTime;
		this.leaseHolder = leaseHolder;
		this.rentRate = rentRate;
		this.location = location;
		this.canUser = canUser;
		this.type = type;
	}


	public String getGroundRentNumber() {
		return groundRentNumber;
	}
	
	public void setGroundRentNumber(String groundRentNumber) {
		this.groundRentNumber = groundRentNumber;
	}

	public String getGroundNumber() {
		return groundNumber;
	}
	public void setGroundNumber(String groundNumber) {
		this.groundNumber = groundNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getRentTime() {
		return rentTime;
	}
	public void setRentTime(Date rentTime) {
		this.rentTime = rentTime;
	}
	public Date getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	public String getLeaseHolder() {
		return leaseHolder;
	}
	public void setLeaseHolder(String leaseHolder) {
		this.leaseHolder = leaseHolder;
	}
	public long getRentRate() {
		return rentRate;
	}
	public void setRentRate(long rentRate) {
		this.rentRate = rentRate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isCanUser() {
		return canUser;
	}
	public void setCanUser(boolean canUser) {
		this.canUser = canUser;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}




	@Override
	public String toString() {
		return "GroundRentVo [groundNumber=" + groundNumber + ", groundRentNumber=" + groundRentNumber
				+ ", description=" + description + ", rentTime=" + rentTime + ", returnTime=" + returnTime
				+ ", leaseHolder=" + leaseHolder + ", rentRate=" + rentRate + ", location=" + location + ", canUser="
				+ canUser + ", type=" + type + "]";
	}
	
	
	
	
	
}
