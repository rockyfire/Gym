package com.gymsystem.action;

import com.gymsystem.vo.EquipmentRepairVo;

public class EquipmentRepairAction extends BaseAction<EquipmentRepairVo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EquipmentRepairVo equipmentRepairVo;

	public String detail() {
		list = equipmentService.getEquipmentRepairs();
		request.put("equipmentRepair", list);
		return "detail_success";
	}

	public String addRepair() {
		equipmentService.addEquipmentRepair(equipmentRepairVo);
		return "addRepair_success";
	}
	
	public EquipmentRepairVo getEquipmentRepairVo() {
		return equipmentRepairVo;
	}

	public void setEquipmentRepairVo(EquipmentRepairVo equipmentRepairVo) {
		this.equipmentRepairVo = equipmentRepairVo;
	}

}
