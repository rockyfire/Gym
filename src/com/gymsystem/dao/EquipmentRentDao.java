package com.gymsystem.dao;

import java.util.List;

import com.gymsystem.po.EquipmentRent;
import com.gymsystem.vo.EquipmentRentVo;

public interface EquipmentRentDao extends BaseDao<EquipmentRent> {

	public void addEquipmentRent(EquipmentRent rent);
	
	public EquipmentRent getEquipmentByName(String equipmentName);
	
	public EquipmentRent getEquipmentByNumber(Integer equipmentNumber);
	
	public List<EquipmentRent> getEquipmentByUser(String username); 
}
