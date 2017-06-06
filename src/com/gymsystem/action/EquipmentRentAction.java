package com.gymsystem.action;

import com.gymsystem.vo.EquipmentRentVo;

public class EquipmentRentAction extends BaseAction<EquipmentRentVo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EquipmentRentVo equipmentRentVo;

	public String detail() {
		list = equipmentService.getEquipmentRents();
		request.put("equipmentRent", list);
		return "detail_success";
	}

	public String addRent() {
		equipmentService.addEquipmentRent(equipmentRentVo);
		return "addRent_success";
	}

	public EquipmentRentVo getEquipmentRentVo() {
		return equipmentRentVo;
	}

	public void setEquipmentRentVo(EquipmentRentVo equipmentRentVo) {
		this.equipmentRentVo = equipmentRentVo;
	}

}
