package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 工作安排表
 * 
 * @author e.IT
 *
 */
public class WorkManage implements Serializable {

	private Integer workManage_id;
	
	private String manageNumber;
	private String descript;		//工作描述
	private String workAddress;
	private String type;
	private Date workStartTime;
	private Date workEndTime;
	
	private GroundRent groundRent;
	private GroundRepaire groundRepaire;
	private EquipmentRent equipmentRent;
	private EquipmentRepair equipmentRepair;
	private GameResource gameResource;
	private List<Worker>workers = new ArrayList<>();
	private TradeCard tradeCard;
	
	public WorkManage() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "WorkManage [workManage_id=" + workManage_id + ", manageNumber=" + manageNumber + ", descript="
				+ descript + ", workAddress=" + workAddress + ", type=" + type + ", workStartTime=" + workStartTime
				+ ", workEndTime=" + workEndTime + ", groundRent=" + groundRent + ", groundRepaire=" + groundRepaire
				+ ", equipmentRent=" + equipmentRent + ", equipmentRepair=" + equipmentRepair + ", gameResource="
				+ gameResource + ", workers=" + workers + ", tradeCard=" + tradeCard + "]";
	}
	public Integer getWorkManage_id() {
		return workManage_id;
	}
	public void setWorkManage_id(Integer workManage_id) {
		this.workManage_id = workManage_id;
	}
	public String getManageNumber() {
		return manageNumber;
	}
	public void setManageNumber(String manageNumber) {
		this.manageNumber = manageNumber;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getWorkStartTime() {
		return workStartTime;
	}
	public void setWorkStartTime(Date workStartTime) {
		this.workStartTime = workStartTime;
	}
	public Date getWorkEndTime() {
		return workEndTime;
	}
	public void setWorkEndTime(Date workEndTime) {
		this.workEndTime = workEndTime;
	}
	public GroundRent getGroundRent() {
		return groundRent;
	}
	public void setGroundRent(GroundRent groundRent) {
		this.groundRent = groundRent;
	}
	public GroundRepaire getGroundRepaire() {
		return groundRepaire;
	}
	public void setGroundRepaire(GroundRepaire groundRepaire) {
		this.groundRepaire = groundRepaire;
	}
	public EquipmentRent getEquipmentRent() {
		return equipmentRent;
	}
	public void setEquipmentRent(EquipmentRent equipmentRent) {
		this.equipmentRent = equipmentRent;
	}
	public EquipmentRepair getEquipmentRepair() {
		return equipmentRepair;
	}
	public void setEquipmentRepair(EquipmentRepair equipmentRepair) {
		this.equipmentRepair = equipmentRepair;
	}
	public GameResource getGameResource() {
		return gameResource;
	}
	public void setGameResource(GameResource gameResource) {
		this.gameResource = gameResource;
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	public TradeCard getTradeCard() {
		return tradeCard;
	}
	public void setTradeCard(TradeCard tradeCard) {
		this.tradeCard = tradeCard;
	}
	public WorkManage(Integer workManage_id, String manageNumber, String descript, String workAddress, String type,
			Date workStartTime, Date workEndTime) {
		super();
		this.workManage_id = workManage_id;
		this.manageNumber = manageNumber;
		this.descript = descript;
		this.workAddress = workAddress;
		this.type = type;
		this.workStartTime = workStartTime;
		this.workEndTime = workEndTime;
	}
	
}
