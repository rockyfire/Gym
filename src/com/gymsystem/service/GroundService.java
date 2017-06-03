package com.gymsystem.service;

import java.util.List;

import com.gymsystem.po.GroundRepaire;
import com.gymsystem.vo.GroundRentVo;
import com.gymsystem.vo.GroundRepairVo;
import com.gymsystem.vo.GroundVo;

public interface GroundService {

	public List<GroundVo> getGroundVo();
	
	
	public List<GroundVo> queryGoundVo();
	
	public boolean addGround(GroundVo groundVo);
	
	public boolean deleteGround(GroundVo groundVo);
	
	public boolean updateGround(GroundVo groundVo);
	
	
	
	/**
	 * ����Ԥ��
	 * 
	 * @param groundVo
	 * @return
	 */
	public boolean addGroundRent(GroundRentVo groundRentVo);
	
	/**
	 * 
	 * ��ȡ��������б�
	 * @return
	 */
	public List<GroundRentVo> getGroundRents();
	
	/**
	 * 
	 * �������ɾ��
	 * @return
	 */
	public boolean deleteGroundRent(GroundRentVo groundRentVo);
	
	
	
	
	/**
	 * ����ά��
	 * @param groundRepairVo
	 * @return
	 */
	public boolean addGroundRepair(GroundRepairVo groundRepairVo);
	
	public List<GroundRepairVo> getGroundRepairs();
	
	
	
	
	
	
}



