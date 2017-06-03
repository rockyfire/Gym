package com.gymsystem.dao;

import com.gymsystem.po.EquipmentRepair;

public interface EquipmentRepaireDao extends BaseDao<EquipmentRepair> {

	public EquipmentRepair getEquipmentByNumber(String number);
	
}
