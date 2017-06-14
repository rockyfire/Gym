package com.gymsystem.action;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;

import com.gymsystem.service.GroundService;
import com.gymsystem.vo.GroundRentVo;
import com.gymsystem.vo.GroundRepairVo;
import com.gymsystem.vo.GroundVo;

public class GroundAction extends BaseAction<GroundVo>{

	
	private String groundNumber;
	private GroundVo groundVo;
	private GroundRepairVo groundRepairVo;
	private GroundRentVo groundRentVo;
	private List<GroundRepairVo> groundRepairVos = new ArrayList<>();
	private List<GroundRentVo> groundRentVos = new ArrayList<>();
	

	
	
	public String addGroundRent(){
		
		groundService.addGroundRent(groundRentVo);
		
		return "addGroundRent_success";
	}
	
//	³¡µØ×â½è
	
	public String toGroundRent(){
		
		groundRentVos = groundService.getGroundRents();
		
		request.put("groundRentVos", groundRentVos);
		
		return "toGroundRent_success";
	}
	
	
	
	
	
	
	
	
	
	
	
	public String addGroundRepair(){
		System.out.println(groundRepairVo.toString());
		groundService.addGroundRepair(groundVo.getGroundNumber(), groundRepairVo);
		return "addGroundRepair_success";
	}
	
	public String  addGround(){
		System.out.println("addGround");
		groundService.addGround(groundVo);
		return "addGround_success";
	}
	
	
	public String deleteGround(){
		groundService.deleteGround(groundVo);
		return "deleteGround_success";
	}
	
	
	public String toGroundRepaires(){
		
		
		groundRepairVos = groundService.getGroundRepairByNumber(groundVo.getGroundNumber());
		request.put("groundRepairs", groundRepairVos);
		request.put("groundNumber", groundVo.getGroundNumber());
		return "toGroundRepaires_success";
	}
	
	
	
	public String toGroundList(){
		System.out.println("toGroundList");
		list = groundService.getGroundVos();
		request.put("grounds", list);
		System.out.println(list.toString());
		return "toGroundList_success";
	}
	
	
	public String getGroundNumber() {
		return groundNumber;
	}
	
	public void setGroundNumber(String groundNumber) {
		this.groundNumber = groundNumber;
	}
	
	
	public GroundVo getGroundVo() {
		return groundVo;
	}
	
	public void setGroundVo(GroundVo groundVo) {
		this.groundVo = groundVo;
	}
	
	public List<GroundRepairVo> getGroundRepairVos() {
		return groundRepairVos;
	}
	
	public GroundRepairVo getGroundRepairVo() {
		return groundRepairVo;
	}
	
	public void setGroundRepairVo(GroundRepairVo groundRepairVo) {
		this.groundRepairVo = groundRepairVo;
	}
	
	public GroundRentVo getGroundRentVo() {
		return groundRentVo;
	}
	
	public void setGroundRentVo(GroundRentVo groundRentVo) {
		this.groundRentVo = groundRentVo;
	}
}
