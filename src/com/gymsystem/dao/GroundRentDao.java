package com.gymsystem.dao;

import com.gymsystem.po.GroundRent;

public interface GroundRentDao extends BaseDao<GroundRent> {

	public GroundRent getGroundRentByNumber(String groundNumber);
	
	
	
}
