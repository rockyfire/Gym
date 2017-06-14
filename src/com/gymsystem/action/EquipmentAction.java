package com.gymsystem.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.gymsystem.vo.EquipmentVo;

public class EquipmentAction extends BaseAction<EquipmentVo>  implements ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EquipmentVo equipmentVo;
	private HttpServletRequest httpRequest;

	public String login() {
		list = equipmentService.getEquipments();
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
	
	public String queryDetail() {
		String user=httpRequest.getParameter("user");
		list = equipmentService.getEquipments();
		request.put("equipment", list);
		if (user!=null && user.equals("hello")) {
			return "queryDetail_user_success";
		}
		return "queryDetail_success";
	}
	
	public String query() {
		String user=httpRequest.getParameter("user");
		list = equipmentService.queryEquipment(equipmentVo);
		request.put("equipment", list);
		if (user!=null && user.equals("hello")) {
			return "query_user_success";
		}
		return "query_success";
	}

	public EquipmentVo getEquipmentVo() {
		return equipmentVo;
	}

	public void setEquipmentVo(EquipmentVo equipmentVo) {
		this.equipmentVo = equipmentVo;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		httpRequest=arg0;
	}
}