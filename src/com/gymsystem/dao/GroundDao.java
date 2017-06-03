package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import com.gymsystem.po.Ground;

public interface GroundDao extends BaseDao<Ground> {


	/**
	 * 
	 * ģ����ѯ�����أ�
	 * 
	 * @param queryCondition ��ѯ����
	 * @return
	 */
	public List<Ground> getGrounds(Map<String,String>queryCondition);
	
	public Ground getGroundByNumber(String groundNumber);
	
	public Ground getGroundByName(String GroundName);
	
	public List<Ground> getUsableGrounds();
}
