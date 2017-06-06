package com.gymsystem.dao;

import com.gymsystem.po.EquipmentRepair;

public interface EquipmentRepaireDao extends BaseDao<EquipmentRepair> {

	public void addEquipmentRepair(EquipmentRepair repair);
	
	public EquipmentRepair getEquipmentByName(String equipmentName);
	
	public EquipmentRepair getEquipmentByNumber(String equipmentNumber);
	
}
