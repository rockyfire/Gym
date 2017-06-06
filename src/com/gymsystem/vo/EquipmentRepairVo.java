package com.gymsystem.vo;

import java.util.Date;

public class EquipmentRepairVo {

	private String equipmentRepairNumber;

	private String equipmentName;
	private Date equipmentTime;
	private int equipmentNumber;
	private long pay;
	private String workers;
	private String description;

	// 器材维修的详细信息
	public EquipmentRepairVo(String equipmentRepairNumber,
			String equipmentName, Date equipmentTime, long pay,
			String workers, int equipmentNumber, String description) {
		super();
		this.equipmentRepairNumber = equipmentRepairNumber;
		this.equipmentName = equipmentName;
		this.equipmentTime = equipmentTime;
		this.pay = pay;
		this.workers = workers;
		this.equipmentNumber = equipmentNumber;
		this.description = description;
	}

	public EquipmentRepairVo() {
		// TODO Auto-generated constructor stub
	}

	public String getEquipmentRepairNumber() {
		return equipmentRepairNumber;
	}

	public void setEquipmentRepairNumber(String equipmentRepairNumber) {
		this.equipmentRepairNumber = equipmentRepairNumber;
	}

	public String getWorkers() {
		return workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
	}

	public long getPay() {
		return pay;
	}

	public void setPay(long pay) {
		this.pay = pay;
	}

	public Date getEquipmentTime() {
		return equipmentTime;
	}

	public void setEquipmentTime(Date equipmentTime) {
		this.equipmentTime = equipmentTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEquipmentNumber() {
		return equipmentNumber;
	}

	public void setEquipmentNumber(int equipmentNumber) {
		this.equipmentNumber = equipmentNumber;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	@Override
	public String toString() {
		return "EquipmentRepairVo [equipmentRepairNumber="
				+ equipmentRepairNumber + ", workers=" + workers + ", pay="
				+ pay + ", equipmentTime=" + equipmentTime + ", description="
				+ description + ", equipmentNumber=" + equipmentNumber
				+ ", equipmentName=" + equipmentName + "]";
	}

}
