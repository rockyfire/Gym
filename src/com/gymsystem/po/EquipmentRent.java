package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Table;

@Table(name = "t_EQUIPMENTRENT")
public class EquipmentRent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer equipmentRent_id;

	private int account;

	private Date rentTime;
	private Date returnTime;
	private Double rentRate;

	private String canUse;
	private String usage; // 使用情况

	private String reason;
	private String connection;

	private User user;
	private Equipment equipment;
	private TradeCard tradeCard;
	private GameResource gameResource;

	public EquipmentRent() {
		// TODO Auto-generated constructor stub
	}

	public EquipmentRent(int account, Date rentTime, Date returnTime,
			Double rentRate) {
		super();
		this.account = account;
		this.rentTime = rentTime;
		this.returnTime = returnTime;
		this.rentRate = rentRate;
	}

	@Override
	public String toString() {
		return "EquipmentRent [equipmentRent_id=" + equipmentRent_id
				+ ", rentTime=" + rentTime + ", returnTime=" + returnTime
				+ ", rentRate=" + rentRate + ", account=" + account
				+ ", canUse=" + canUse + ", usage=" + usage + ", user=" + user
				+ ", equipment=" + equipment + ", tradeCard=" + tradeCard
				+ ", gameResource=" + gameResource + "]";
	}

	public Integer getEquipmentRent_id() {
		return equipmentRent_id;
	}

	public void setEquipmentRent_id(Integer equipmentRent_id) {
		this.equipmentRent_id = equipmentRent_id;
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

	public Double getRentRate() {
		return rentRate;
	}

	public void setRentRate(Double rentRate) {
		this.rentRate = rentRate;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getCanUse() {
		return canUse;
	}

	public void setCanUse(String canUse) {
		this.canUse = canUse;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public TradeCard getTradeCard() {
		return tradeCard;
	}

	public void setTradeCard(TradeCard tradeCard) {
		this.tradeCard = tradeCard;
	}

	public GameResource getGameResource() {
		return gameResource;
	}

	public void setGameResource(GameResource gameResource) {
		this.gameResource = gameResource;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}
}
