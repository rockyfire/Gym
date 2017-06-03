package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipment implements Serializable{
	
	private Integer equipment_id;
	
	private String equipmentNumber;
	private String name;
	private String type;
	private String location;
	private String rate;
	private Date buyTime;
	private int  number; //库存
	
	private Date distroyTime;
	private boolean canUse;	
	
	private List<EquipmentRent> equipmentRents = new ArrayList<>();
	private List<EquipmentRepair> equipmentRepairs = new ArrayList<>();
	
	
	public Equipment() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getEquipment_id() {
		return equipment_id;
	}
	public void setEquipment_id(Integer equipment_id) {
		this.equipment_id = equipment_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Date getDistroyTime() {
		return distroyTime;
	}
	public void setDistroyTime(Date distroyTime) {
		this.distroyTime = distroyTime;
	}
	public boolean isCanUse() {
		return canUse;
	}
	public void setCanUse(boolean canUse) {
		this.canUse = canUse;
	}
	public String getEquipmentNumber() {
		return equipmentNumber;
	}
	public void setEquipmentNumber(String equipmentNumber) {
		this.equipmentNumber = equipmentNumber;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<EquipmentRent> getEquipmentRents() {
		return equipmentRents;
	}
	public void setEquipmentRents(List<EquipmentRent> equipmentRents) {
		this.equipmentRents = equipmentRents;
	}
	public List<EquipmentRepair> getEquipmentRepairs() {
		return equipmentRepairs;
	}
	public void setEquipmentRepairs(List<EquipmentRepair> equipmentRepairs) {
		this.equipmentRepairs = equipmentRepairs;
	}
	@Override
	public String toString() {
		return "Equipment [equipment_id=" + equipment_id + ", type=" + type + ", name=" + name + ", location="
				+ location + ", rate=" + rate + ", buyTime=" + buyTime + ", distroyTime=" + distroyTime + ", canUse="
				+ canUse + ", equipmentNumber=" + equipmentNumber + ", number=" + number + ", equipmentRents="
				+ equipmentRents + ", equipmentRepairs=" + equipmentRepairs + "]";
	}
	
	//添加器材
	public Equipment(String equipmentNumber, String name, String type,
			String location, String rate, Date buyTime, int number,boolean canUse) {
		super();
		this.equipmentNumber = equipmentNumber;
		this.name = name;
		this.type = type;
		this.location = location;
		this.rate = rate;
		this.buyTime = buyTime;
		this.number = number;
		this.canUse = canUse;
	}
	
	
	public Equipment(Integer equipment_id, String type, String name, String location, String rate, Date buyTime,
			Date distroyTime, boolean canUse, String equipmentNumber, int number) {
		super();
		this.equipment_id = equipment_id;
		this.type = type;
		this.name = name;
		this.location = location;
		this.rate = rate;
		this.buyTime = buyTime;
		this.distroyTime = distroyTime;
		this.canUse = canUse;
		this.equipmentNumber = equipmentNumber;
		this.number = number;
	}
	
	
	
}
