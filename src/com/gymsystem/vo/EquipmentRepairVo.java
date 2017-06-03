package com.gymsystem.vo;

import java.util.Date;

public class EquipmentRepairVo {

	private String equipmentRepairNumber;
	private String workers;		//Î¬ÐÞÈËÔ±
	private long   pay;
	private Date   equipmentTime;
	private String description;
	private String equipmentNumber;//Î¬ÐÞÆ÷²Ä±àºÅ
	private String equipmentName;  //Î¬ÐÞÆ÷²ÄÃû³Æ
	
	public EquipmentRepairVo() {
		// TODO Auto-generated constructor stub
	}

	public EquipmentRepairVo(String equipmentRepairNumber, String workers, long pay, Date equipmentTime,
			String description, String equipmentNumber, String equipmentName) {
		super();
		this.equipmentRepairNumber = equipmentRepairNumber;
		this.workers = workers;
		this.pay = pay;
		this.equipmentTime = equipmentTime;
		this.description = description;
		this.equipmentNumber = equipmentNumber;
		this.equipmentName = equipmentName;
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

	@Override
	public String toString() {
		return "EquipmentRepairVo [equipmentRepairNumber=" + equipmentRepairNumber + ", workers=" + workers + ", pay="
				+ pay + ", equipmentTime=" + equipmentTime + ", description=" + description + ", equipmentNumber="
				+ equipmentNumber + ", equipmentName=" + equipmentName + "]";
	}
	
	
	
}
