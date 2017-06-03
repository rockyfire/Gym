package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.EquipmentRentVo;
import com.gymsystem.vo.EquipmentRepairVo;
import com.gymsystem.vo.EquipmentVo;

public interface EquipmentService {

	public List<EquipmentVo> getEquipments();
	
	public boolean addEquipment(EquipmentVo equipmentVo);

	public boolean updateEquipment(EquipmentVo equipmentVo);
	
	public boolean deleteEquipment(EquipmentVo equipmentVo);
	
	public List<EquipmentVo> queryEquipment(EquipmentVo equipmentVo);

	public boolean addEquipmentRepair(EquipmentRepairVo equipmentRepairVo);
	
	public List<EquipmentRepairVo> getEquipmentRepairVos();
	
	public boolean addEquipmentRent(EquipmentRentVo equipmentRentVo);
	
	public List<EquipmentRentVo> getEquipmentRents();
	
}
