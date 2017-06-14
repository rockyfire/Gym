package com.gymsystem.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.gymsystem.vo.EquipmentRentVo;

public class EquipmentRentAction extends BaseAction<EquipmentRentVo> implements
		ServletRequestAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EquipmentRentVo equipmentRentVo;
	protected HttpServletRequest request_http;

	// 管理员界面的租借详情
	public String detail() {
		list = equipmentService.getEquipmentRents();
		request.put("equipmentRent", list);
		return "detail_success";
	}

	// 用户界面的器材归还
	public String detailReturn() {
		String username = request_http.getParameter("leaseHolder");
		list = equipmentService.getEquipmentRent_detail(username);
		request.put("equipment", list);
		return "detailReturn_success";
	}

	// 确认归还
	public String confirm() {
		equipmentService.setEquipmentRentUsage(equipmentRentVo,"1");
		return "confirm_success";
	}

	// 管理员界面的器材审批
	public String getDetailReturns() {
		list=equipmentService.getDetailReturns();
		request.put("equipmentRent", list);
		return "getDetailReturns_success";
	}

	// 管理员审核归还 | 通过
	public String checkReturn() {
		equipmentService.setEquipmentRentUsage(equipmentRentVo,"2");
		return "check_success";
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

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request_http = arg0;
	}

}
