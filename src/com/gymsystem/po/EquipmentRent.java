package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Table;

@Table(name = "t_EQUIPMENTRENT")
public class EquipmentRent implements Serializable {

	private Integer equipmentRent_id;

	private Date rentTime;
	private Date returnTime;
	private String rentRate;
	private int account;
	private String canUse;
	private String usage;

	private User user;
	private Equipment equipment;
	private TradeCard tradeCard;
	private GameResource gameResource;

	public EquipmentRent() {
		// TODO Auto-generated constructor stub
	}

	public EquipmentRent(Integer equipmentRent_id, Date rentTime,
			Date returnTime, String rentRate, int account, String canUse,
			String usage) {
		super();
		this.equipmentRent_id = equipmentRent_id;
		this.rentTime = rentTime;
		this.returnTime = returnTime;
		this.rentRate = rentRate;
		this.account = account;
		this.canUse = canUse;
		this.usage = usage;
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

	public String getRentRate() {
		return rentRate;
	}

	public void setRentRate(String rentRate) {
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

}
