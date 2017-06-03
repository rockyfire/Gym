package com.gymsystem.dao;

import com.gymsystem.po.EquipmentRent;

public interface EquipmentRentDao extends BaseDao<EquipmentRent> {

	public void addEquipmentRent(EquipmentRent rent);
	
	public EquipmentRent getEquipmentByName(String equipmentName);
	
	public EquipmentRent getEquipmentByNumber(String equipmentNumber);
}
