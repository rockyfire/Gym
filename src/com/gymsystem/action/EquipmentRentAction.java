package com.gymsystem.action;

import com.gymsystem.vo.EquipmentRentVo;

public class EquipmentRentAction extends BaseAction<EquipmentRentVo> {
	private EquipmentRentVo equipmentRentVo;

	public String addRent(){
		System.out.println(equipmentRentVo.getEquipmentName());
		if (equipmentService.addEquipmentRent(equipmentRentVo)) {
			System.out.print("success");
		}
		return "addRent_success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EquipmentRentVo getEquipmentRentVo() {
		return equipmentRentVo;
	}

	public void setEquipmentRentVo(EquipmentRentVo equipmentRentVo) {
		this.equipmentRentVo = equipmentRentVo;
	}
	
}
