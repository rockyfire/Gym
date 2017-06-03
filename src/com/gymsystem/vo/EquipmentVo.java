package com.gymsystem.vo;

public class EquipmentVo {

	private String equipmentNumber;  //器材编号
	private String equipmentName; 
	private String equipmentType;
	private String equipmentLocation;
	private long   rentRate;
	private String buyTime;
	private int    equipmentAccount;	//器材数量		
	
	private boolean canUse;				//����״̬
	
	public EquipmentVo() {
		// TODO Auto-generated constructor stub
	}
	//Detail Equipment 返回器材的详细信息
	public EquipmentVo(String equipmentNumber, String equipmentName,
			String equipmentLocation, long rentRate, int equipmentAccount,
			boolean canUse) {
		super();
		this.equipmentNumber = equipmentNumber;
		this.equipmentName = equipmentName;
		this.equipmentLocation = equipmentLocation;
		this.rentRate = rentRate;
		this.equipmentAccount = equipmentAccount;
		this.canUse = canUse;
	}
	//Add EquipmentVo 添加器材
	public EquipmentVo(String equipmentNumber, String equipmentName, String equipmentType, String equipmentLocation,
			int equipmentAccount, long rentRate, String buyTime,  boolean canUse) {
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
	public long getRentRate() {
		return rentRate;
	}
	public void setRentRate(long rentRate) {
		this.rentRate = rentRate;
	}
	public String getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(String buyTime) {
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
		return "EquipmentVo [equipmentNumber=" + equipmentNumber + ", equipmentName=" + equipmentName
				+ ", equipmentType=" + equipmentType + ", equipmentLocation=" + equipmentLocation
				+ ", equipmentAccount=" + equipmentAccount + ", rentRate=" + rentRate + ", buyTime=" + buyTime
				+ ", canUse=" + canUse + "]";
	}
	
	
	
}
