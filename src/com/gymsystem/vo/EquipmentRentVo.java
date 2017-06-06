package com.gymsystem.vo;

import java.util.Date;

public class EquipmentRentVo {
	private String equipmentRentNumber;
	private String equipmentName;
	private int rentNumber; // 租借数量
	private String leaseHolder; // 租借人
	private Date rentTime;
	private Date returnTime;
	private Double totalRent;

	public EquipmentRentVo() {
		// TODO Auto-generated constructor stub
	}

	// 返回详细信息
	public EquipmentRentVo(String equipmentRentNumber, String equipmentName,
			int rentNumber, String leaseHolder, Date rentTime,
			Date returnTime, Double totalRent) {
		super();
		this.equipmentRentNumber = equipmentRentNumber;
		this.equipmentName = equipmentName;
		this.rentNumber = rentNumber;
		this.leaseHolder = leaseHolder;
		this.rentTime = rentTime;
		this.returnTime = returnTime;
		this.totalRent = totalRent;
	}

	public String getEquipmentRentNumber() {
		return equipmentRentNumber;
	}

	public void setEquipmentRentNumber(String equipmentRentNumber) {
		this.equipmentRentNumber = equipmentRentNumber;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public int getRentNumber() {
		return rentNumber;
	}

	public void setRentNumber(int rentNumber) {
		this.rentNumber = rentNumber;
	}

	public String getLeaseHolder() {
		return leaseHolder;
	}

	public void setLeaseHolder(String leaseHolder) {
		this.leaseHolder = leaseHolder;
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

	public Double getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(Double totalRent) {
		this.totalRent = totalRent;
	}

}
