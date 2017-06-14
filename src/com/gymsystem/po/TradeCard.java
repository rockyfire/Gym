package com.gymsystem.po;


/**
 * 
 * 交易单
 * 
 * @author e.IT
 *
 */
public class TradeCard {

	private Integer tradeCard_id;
	private String tradeNumber;
	private String type;
	private boolean isOut;
	private boolean isIn;
	private long account;  	//金额
	
	private EquipmentRent equipmentRent;
	private EquipmentRepair equipmentRepair;
	private GroundRent groundRent;
	private GroundRepaire groundRepaire;
	private WorkManage workManage;
	
	
	
	public TradeCard() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "TradeCard [tradeCard_id=" + tradeCard_id + ", tradeNumber=" + tradeNumber + ", type=" + type
				+ ", isOut=" + isOut + ", isIn=" + isIn + ", account=" + account + ", equipmentRent=" + equipmentRent
				+ ", equipmentRepair=" + equipmentRepair + ", groundRent=" + groundRent + ", groundRepaire="
				+ groundRepaire + ", workManage=" + workManage + "]";
	}
	public Integer getTradeCard_id() {
		return tradeCard_id;
	}
	public void setTradeCard_id(Integer tradeCard_id) {
		this.tradeCard_id = tradeCard_id;
	}
	public String getTradeNumber() {
		return tradeNumber;
	}
	public void setTradeNumber(String tradeNumber) {
		this.tradeNumber = tradeNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isOut() {
		return isOut;
	}
	public void setOut(boolean isOut) {
		this.isOut = isOut;
	}
	public boolean isIn() {
		return isIn;
	}
	public void setIn(boolean isIn) {
		this.isIn = isIn;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
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
	public WorkManage getWorkManage() {
		return workManage;
	}
	public void setWorkManage(WorkManage workManage) {
		this.workManage = workManage;
	}
	public TradeCard(Integer tradeCard_id, String tradeNumber, String type, boolean isOut, boolean isIn, long account,
			EquipmentRent equipmentRent, EquipmentRepair equipmentRepair, GroundRent groundRent,
			GroundRepaire groundRepaire, WorkManage workManage) {
		super();
		this.tradeCard_id = tradeCard_id;
		this.tradeNumber = tradeNumber;
		this.type = type;
		this.isOut = isOut;
		this.isIn = isIn;
		this.account = account;
		this.equipmentRent = equipmentRent;
		this.equipmentRepair = equipmentRepair;
		this.groundRent = groundRent;
		this.groundRepaire = groundRepaire;
		this.workManage = workManage;
	}
	
}
