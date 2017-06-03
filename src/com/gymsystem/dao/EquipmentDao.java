package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import com.gymsystem.po.Equipment;

public interface EquipmentDao extends BaseDao<Equipment> {

	/**
	 * ģ���ѯ
	 * 
	 * @param queryCondition
	 * @return
	 */
	public void addEquipment(Equipment equipment);
	
	public List<Equipment> getEquipments(Map<String,String> queryCondition);
	
	public Equipment getEquipmentByNumber(String equipment);
	
	public List<Equipment> getEquipmentByType(String equipmentType);
	
	public List<Equipment> getEquipmentByName(String equipmentName);
	
	/**
	 *	��ȡ���õ�����
	 * 
	 * @return
	 */
	public List<Equipment> getUsableEquipments();
	
}
