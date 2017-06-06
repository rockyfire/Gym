package com.gymsystem.vo;

import java.util.Date;

public class EquipmentVo {

	private String equipmentNumber; // 器材编号
	private String equipmentName;
	private String equipmentType;
	private String equipmentLocation;
	private double rentRate;
	private Date buyTime;

	private int equipmentAccount; 	// 器材数量
	private int idleNumber;  		// 空闲数量
	private int rentedNumber; 		// 已借数量
	private int repairNumber; 		// 维修数量

	private boolean canUse; 		// 是否可用

	public EquipmentVo() {
		// TODO Auto-generated constructor stub
	}

	// Detail Equipment 返回器材的详细信息 && 条件查询
	public EquipmentVo(String equipmentNumber, String equipmentName,
			String equipmentLocation, double rentRate, int equipmentAccount,
			int idleNumber, int rentedNumber, int repairNumber, boolean canUse) {
		super();
		this.equipmentNumber = equipmentNumber;
		this.equipmentName = equipmentName;
		this.equipmentLocation = equipmentLocation;
		this.rentRate = rentRate;
		this.equipmentAccount = equipmentAccount;
		this.idleNumber = idleNumber;
		this.rentedNumber = rentedNumber;
		this.repairNumber = repairNumber;
		this.canUse = canUse;
	}

	// Add EquipmentVo 添加器材
	public EquipmentVo(String equipmentNumber, String equipmentName,
			String equipmentType, String equipmentLocation,
			int equipmentAccount, double rentRate, Date buyTime,
			boolean canUse) {
		super();
		this.equipmentNumber = equipmentNumber;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.equipmentLocation = equipmentLocation;
		this.equipmentAccount = equipmentAccount;
		this.rentRate = rentRate;
		this.buyTime = buyTime;
		this.canUse = canUse;
	}

	public int getIdleNumber() {
		return idleNumber;
	}

	public void setIdleNumber(int idleNumber) {
		this.idleNumber = idleNumber;
	}

	public int getRentedNumber() {
		return rentedNumber;
	}

	public void setRentedNumber(int rentedNumber) {
		this.rentedNumber = rentedNumber;
	}

	public int getRepairNumber() {
		return repairNumber;
	}

	public void setRepairNumber(int repairNumber) {
		this.repairNumber = repairNumber;
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

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getEquipmentLocation() {
		return equipmentLocation;
	}

	public void setEquipmentLocation(String equipmentLocation) {
		this.equipmentLocation = equipmentLocation;
	}

	public int getEquipmentAccount() {
		return equipmentAccount;
	}

	public void setEquipmentAccount(int equipmentAccount) {
		this.equipmentAccount = equipmentAccount;
	}

	public double getRentRate() {
		return rentRate;
	}

	public void setRentRate(double rentRate) {
		this.rentRate = rentRate;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public boolean isCanUse() {
		return canUse;
	}

	public void setCanUse(boolean canUse) {
		this.canUse = canUse;
	}

	@Override
	public String toString() {
		return "EquipmentVo [equipmentNumber=" + equipmentNumber
				+ ", equipmentName=" + equipmentName + ", equipmentType="
				+ equipmentType + ", equipmentLocation=" + equipmentLocation
				+ ", equipmentAccount=" + equipmentAccount + ", rentRate="
				+ rentRate + ", buyTime=" + buyTime + ", canUse=" + canUse
				+ "]";
	}
}
