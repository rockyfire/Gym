package com.gymsystem.action;

import com.gymsystem.vo.EquipmentVo;

public class EquipmentAction extends BaseAction<EquipmentVo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EquipmentVo equipmentVo;

	public String login() {
		list = equipmentService.getEquipments();
		System.out.print(list.get(0).getEquipmentAccount());
		request.put("equipment", list);
		return "login_success";
	}
	
	public String detail() {
		list = equipmentService.getEquipments();
		request.put("equipment", list);
		return "detail_success";
	}

	public String add() {
		equipmentService.addEquipment(equipmentVo);
		return "add_success";
	}

	public String delete() {
		equipmentService.deleteEquipment(equipmentVo);
		return "delete_success";
	}

	public String query() {
		list = equipmentService.queryEquipment(equipmentVo);
		request.put("equipment", list);
		return "query_success";
	}
	
	public EquipmentVo getEquipmentVo() {
		return equipmentVo;
	}

	public void setEquipmentVo(EquipmentVo equipmentVo) {
		this.equipmentVo = equipmentVo;
	}
}