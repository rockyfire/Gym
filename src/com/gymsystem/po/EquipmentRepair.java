package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentRepair implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer equipmentRepair_Id;
	
	private Date repairTime;
	private int equipmentRepairNumber;

	private String repairContent;

	private Equipment equipment;
	private TradeCard tradeCard;
	private List<WorkManage> workManages = new ArrayList<>();

	public EquipmentRepair() {
		// TODO Auto-generated constructor stub
	}

	//添加维修
	public EquipmentRepair(Date repairTime,
			int equipmentRepairNumber, String repairContent) {
		super();
		this.repairTime = repairTime;
		this.equipmentRepairNumber = equipmentRepairNumber;
		this.repairContent = repairContent;
	}
	
	@Override
	public String toString() {
		return "EquipmentRepair [equipmentRepair_Id=" + equipmentRepair_Id
				+ ", equipmentRepairNumber=" + equipmentRepairNumber
				+ ", repairTime=" + repairTime + ", repairContent="
				+ repairContent + ", equipment=" + equipment + ", tradeCard="
				+ tradeCard + ", workManages=" + workManages + "]";
	}

	public int getEquipmentRepairNumber() {
		return equipmentRepairNumber;
	}

	public void setEquipmentRepairNumber(int equipmentRepairNumber) {
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

}
