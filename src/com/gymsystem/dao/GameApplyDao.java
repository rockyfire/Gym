package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import com.gymsystem.po.GameApply;

public interface GameApplyDao extends BaseDao<GameApply> {

	public GameApply getGameApplyByNumber(String number);
	
	/**
	 * 
	 * Ä£ºý²éÑ¯
	 * 
	 * @param queryCondition
	 * @return
	 */
	public List<GameApply> getGameApplies(Map<String,String> queryCondition);
	
}
