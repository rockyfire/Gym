package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

public class GroundRent implements Serializable {

	private Integer groundRend_id;
	private String groundRendNumber;
	private Date rentStartTime;
	private Date rentEndTime;
	private String userage;			//用途
	private boolean isBroken;
	
	private TradeCard tradeCard;	//交易单
	private User user;				//租借人
	private Ground ground;			//场地信息表
	private GameResource gameResource;	//赛事资源
	
	public GroundRent() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "GroundRent [groundRend_id=" + groundRend_id + ", groundRendNumber=" + groundRendNumber
				+ ", rentStartTime=" + rentStartTime + ", rentEndTime=" + rentEndTime + ", userage=" + userage
				+ ", isBroken=" + isBroken + ", tradeCard=" + tradeCard + ", user=" + user + ", ground=" + ground
				+ ", gameResource=" + gameResource + "]";
	}
	public Integer getGroundRend_id() {
		return groundRend_id;
	}
	public void setGroundRend_id(Integer groundRend_id) {
		this.groundRend_id = groundRend_id;
	}
	
	public String getGroundRendNumber() {
		return groundRendNumber;
	}

	public void setGroundRendNumber(String groundRendNumber) {
		this.groundRendNumber = groundRendNumber;
	}

	public Date getRentStartTime() {
		return rentStartTime;
	}
	public void setRentStartTime(Date rentStartTime) {
		this.rentStartTime = rentStartTime;
	}
	public Date getRentEndTime() {
		return rentEndTime;
	}
	public void setRentEndTime(Date rentEndTime) {
		this.rentEndTime = rentEndTime;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	public boolean isBroken() {
		return isBroken;
	}
	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}
	public TradeCard getTradeCard() {
		return tradeCard;
	}
	public void setTradeCard(TradeCard tradeCard) {
		this.tradeCard = tradeCard;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Ground getGround() {
		return ground;
	}
	public void setGround(Ground ground) {
		this.ground = ground;
	}
	public GameResource getGameResource() {
		return gameResource;
	}
	public void setGameResource(GameResource gameResource) {
		this.gameResource = gameResource;
	}

	public GroundRent(String groundRendNumber, Date rentStartTime, Date rentEndTime, String userage, boolean isBroken) {
		super();
		this.groundRendNumber = groundRendNumber;
		this.rentStartTime = rentStartTime;
		this.rentEndTime = rentEndTime;
		this.userage = userage;
		this.isBroken = isBroken;
	}
}
