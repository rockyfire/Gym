package com.gymsystem.vo;

import java.util.Date;

public class EquipmentRentVo {

	private String equipmentRentNumber;
	private Date   rentTime;
	private Date   returnTime;
	private long   totalRent;
	private String description;			//描述
	private String rentNumber;			//租借数量
	private String equipmentNumber;
	private String equipmentName;		
	private String leaseHolder;			//租借人
	
	public EquipmentRentVo() {
		// TODO Auto-generated constructor stub
	}
	
	public EquipmentRentVo(String equipmentRentNumber, Date rentTime, Date returnTime, long totalRent,
			String description, String rentNumber, String equipmentNumber, String equipmentName, String leaseHolder) {
		super();
		this.equipmentRentNumber = equipmentRentNumber;
		this.rentTime = rentTime;
		this.returnTime = returnTime;
		this.totalRent = totalRent;
		this.description = description;
		this.rentNumber = rentNumber;
		this.equipmentNumber = equipmentNumber;
		this.equipmentName = equipmentName;
		this.leaseHolder = leaseHolder;
	}
	public String getEquipmentRentNumber() {
		return equipmentRentNumber;
	}
	public void setEquipmentRentNumber(String equipmentRentNumber) {
		this.equipmentRentNumber = equipmentRentNumber;
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
	public long getTotalRent() {
		return totalRent;
	}
	public void setTotalRent(long totalRent) {
		this.totalRent = totalRent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRentNumber() {
		return rentNumber;
	}
	public void setRentNumber(String rentNumber) {
		this.rentNumber = rentNumber;
	}
	public String getEquipmentNumber() {
		return equipmentNumber;
	}
	public void setEquipmentNumber(String equipmentNumber) {
		this.equipmentNumber = equipmentNumber;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getLeaseHolder() {
		return leaseHolder;
	}
	public void setLeaseHolder(String leaseHolder) {
		this.leaseHolder = leaseHolder;
	}
	@Override
	public String toString() {
		return "EquipmentRentVo [equipmentRentNumber=" + equipmentRentNumber + ", rentTime=" + rentTime
				+ ", returnTime=" + returnTime + ", totalRent=" + totalRent + ", description=" + description
				+ ", rentNumber=" + rentNumber + ", equipmentNumber=" + equipmentNumber + ", equipmentName="
				+ equipmentName + ", leaseHolder=" + leaseHolder + "]";
	}
	
	
	
	
}
