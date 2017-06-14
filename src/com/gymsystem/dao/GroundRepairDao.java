package com.gymsystem.dao;

import java.util.Date;
import java.util.List;

import com.gymsystem.po.GroundRepaire;

public interface GroundRepairDao extends BaseDao<GroundRepaire> {

	
	public GroundRepaire getGroundRepaireByNumber(String groundRepaireNumber);
	
	public List<GroundRepaire>getGroundRepaireByDate(Date date);
	
	
}
