package com.gymsystem.vo;

public class GroundVo {

	private String groundNumber;
	private String groundName;
	private String groundType;
	private String groundLocation;
	private String description;
	private long   rentRate;		//租金
	private boolean canUser;
	private int    groundAccount;	//场地数量
	
	public GroundVo() {
		// TODO Auto-generated constructor stub
	}

	
	
	public GroundVo(String groundNumber, String groundName, String groundType, String groundLocation,
			String description, long rentRate, boolean canUser, int groundAccount) {
		super();
		this.groundNumber = groundNumber;
		this.groundName = groundName;
		this.groundType = groundType;
		this.groundLocation = groundLocation;
		this.description = description;
		this.rentRate = rentRate;
		this.canUser = canUser;
		this.groundAccount = groundAccount;
	}



	@Override
	public String toString() {
		return "GroundVo [groundNumber=" + groundNumber + ", groundName=" + groundName + ", groundType=" + groundType
				+ ", groundLocation=" + groundLocation + ", description=" + description + ", rentRate=" + rentRate
				+ ", canUser=" + canUser + ", groundAccount=" + groundAccount + "]";
	}

	public String getGroundNumber() {
		return groundNumber;
	}

	public void setGroundNumber(String groundNumber) {
		this.groundNumber = groundNumber;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getGroundType() {
		return groundType;
	}

	public void setGroundType(String groundType) {
		this.groundType = groundType;
	}

	public String getGroundLocation() {
		return groundLocation;
	}

	public void setGroundLocation(String groundLocation) {
		this.groundLocation = groundLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getRentRate() {
		return rentRate;
	}

	public void setRentRate(long rentRate) {
		this.rentRate = rentRate;
	}

	public boolean isCanUser() {
		return canUser;
	}

	public void setCanUser(boolean canUser) {
		this.canUser = canUser;
	}

	public int getGroundAccount() {
		return groundAccount;
	}

	public void setGroundAccount(int groundAccount) {
		this.groundAccount = groundAccount;
	}
	
	
}
