package com.gymsystem.service;

import java.util.List;

import com.gymsystem.po.GroundRepaire;
import com.gymsystem.vo.GroundRentVo;
import com.gymsystem.vo.GroundRepairVo;
import com.gymsystem.vo.GroundVo;

public interface GroundService {

	public List<GroundVo> getGroundVos();
	
	
	public List<GroundVo> queryGoundVos();
	
	public boolean addGround(GroundVo groundVo);
	
	public boolean deleteGround(GroundVo groundVo);
	
	public boolean updateGround(GroundVo groundVo);
	
	public GroundVo getGroundVoByNumber(String groundNumber);
	
	public List<GroundRepairVo> getGroundRepairByNumber(String groundNumber);
	
	public boolean addGroundRepair(String groundNumber,GroundRepairVo groundRepairVo);
	
	
	/**
	 * 场地预定
	 * 
	 * @param groundVo
	 * @return
	 */
	public boolean addGroundRent(GroundRentVo groundRentVo);
	
	/**
	 * 
	 * 获取场地租借列表
	 * @return
	 */
	public List<GroundRentVo> getGroundRents();
	
	/**
	 * 
	 * 场地租借删除
	 * @return
	 */
	public boolean deleteGroundRent(GroundRentVo groundRentVo);
	
	
	
	
	/**
	 * 场地维修
	 * @param groundRepairVo
	 * @return
	 */
	public boolean addGroundRepair(GroundRepairVo groundRepairVo);
	
	public List<GroundRepairVo> getGroundRepairs();
	
	
	
	
	
	
}



