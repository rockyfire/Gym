package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.New;

public class EquipmentRepair implements Serializable{

	private Integer equipmentRepair_Id;
	private String equipmentRepairNumber;
	private Date repairTime;
	private String repairContent;
	
	private Equipment equipment;
	private TradeCard tradeCard;
	private List<WorkManage> workManages = new ArrayList<>(); //安排多个人维修
	
	public EquipmentRepair() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "EquipmentRepair [equipmentRepair_Id=" + equipmentRepair_Id + ", equipmentRepairNumber=" + equipmentRepairNumber
				+ ", repairTime=" + repairTime + ", repairContent=" + repairContent + ", equipment=" + equipment
				+ ", tradeCard=" + tradeCard + ", workManages=" + workManages + "]";
	}




	public String getEquipmentRepairNumber() {
		return equipmentRepairNumber;
	}


	public void setEquipmentRepairNumber(String equipmentRepairNumber) {
		this.equipmentRepairNumber = equipmentRepairNumber;
	}


	public Integer getEquipmentRepair_Id() {
		return equipmentRepair_Id;
	}
	public void setEquipmentRepair_Id(Integer equipmentRepair_Id) {
		this.equipmentRepair_Id = equipmentRepair_Id;
	}
	public Date getRepairTime() {
		return repairTime;
	}
	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}
	public String getRepairContent() {
		return repairContent;
	}
	public void setRepairContent(String repairContent) {
		this.repairContent = repairContent;
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
	public List<WorkManage> getWorkManages() {
		return workManages;
	}
	public void setWorkManages(List<WorkManage> workManages) {
		this.workManages = workManages;
	}


	public EquipmentRepair(String equipmentNumber, Date repairTime, String repairContent) {
		super();
		this.equipmentRepairNumber = equipmentRepairNumber;
		this.repairTime = repairTime;
		this.repairContent = repairContent;
	}
	
}
