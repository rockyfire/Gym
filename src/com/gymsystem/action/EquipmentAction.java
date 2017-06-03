package com.gymsystem.action;

import java.util.Date;

import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.EquipmentVo;

public class EquipmentAction extends BaseAction<EquipmentVo> {
	private EquipmentVo equipmentVo;

	public String login(){
		list=equipmentService.getEquipments();
		request.put("equipment", list);
		return "login_success";
	}
	
	public String add() {
		equipmentService.addEquipment(equipmentVo);
		return "add_success";
	}
	
	public String delete(){
		equipmentService.deleteEquipment(equipmentVo);
		return "delete_success";
	}
	
	

	public EquipmentVo getEquipmentVo() {
		return equipmentVo;
	}

	public void setEquipmentVo(EquipmentVo equipmentVo) {
		this.equipmentVo = equipmentVo;
	}
}