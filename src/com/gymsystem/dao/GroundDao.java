package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import com.gymsystem.po.Ground;

public interface GroundDao extends BaseDao<Ground> {


	/**
	 * 
	 * 模糊查询（场地）
	 * 
	 * @param queryCondition 查询条件
	 * @return
	 */
	public List<Ground> getGrounds(Map<String,String>queryCondition);
	
	public Ground getGroundByNumber(String groundNumber);
	
	public Ground getGroundByName(String GroundName);
	
	public List<Ground> getUsableGrounds();
}
