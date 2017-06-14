package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ground implements Serializable {

	private Integer ground_id;
	private String groundNumber;
	private String type;
	private String location;
	private int    groundAccount;
	private String groundName;
	private String descript;		//场地说明
	private boolean canUse;
	private long groundRentRate;	//场地租金，该字段对应的租金表可以删除，用该字段替代
	
	private List<GroundRent> groundRents = new ArrayList<>();
	private List<GroundRepaire> groundRepaires = new ArrayList<>();//场地维修
	
	
	public Ground() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Ground [ground_id=" + ground_id + ", groundNumber=" + groundNumber + ", type=" + type + ", location="
				+ location + ", groundAccount=" + groundAccount + ", groundName=" + groundName + ", descript="
				+ descript + ", canUse=" + canUse + ", groundRentRate=" + groundRentRate + ", groundRents="
				+ groundRents + ", groundRepaires=" + groundRepaires + "]";
	}


	public Integer getGround_id() {
		return ground_id;
	}
	public void setGround_id(Integer ground_id) {
		this.ground_id = ground_id;
	}
	
	public String getGroundNumber() {
		return groundNumber;
	}

	public void setGroundNumber(String groundNumber) {
		this.groundNumber = groundNumber;
	}

	public int getGroundAccount() {
		return groundAccount;
	}
	
	public void setGroundAccount(int groundAccount) {
		this.groundAccount = groundAccount;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGroundName() {
		return groundName;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public boolean isCanUse() {
		return canUse;
	}
	public void setCanUse(boolean canUse) {
		this.canUse = canUse;
	}
	public long getGroundRentRate() {
		return groundRentRate;
	}
	public void setGroundRentRate(long groundRentRate) {
		this.groundRentRate = groundRentRate;
	}
	public List<GroundRent> getGroundRents() {
		return groundRents;
	}
	public void setGroundRents(List<GroundRent> groundRents) {
		this.groundRents = groundRents;
	}
	public List<GroundRepaire> getGroundRepaires() {
		return groundRepaires;
	}
	public void setGroundRepaires(List<GroundRepaire> groundRepaires) {
		this.groundRepaires = groundRepaires;
	}


	public Ground(String groundNumber, String type, String location, int groundAccount, String groundName,
			String descript, boolean canUse, long groundRentRate) {
		super();
		this.groundNumber = groundNumber;
		this.type = type;
		this.location = location;
		this.groundAccount = groundAccount;
		this.groundName = groundName;
		this.descript = descript;
		this.canUse = canUse;
		this.groundRentRate = groundRentRate;
	}

	
}
