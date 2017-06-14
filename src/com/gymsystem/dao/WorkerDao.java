package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import com.gymsystem.po.Worker;

public interface WorkerDao extends BaseDao<Worker> {

	/**
	 * Ä£ºý²éÑ¯
	 * 
	 * @param queryCondition
	 * @return
	 */
	public List<Worker> getWorkers(Map<String,String> queryCondition);
	
	public Worker getWorkerByNumber(String number);
	
	public Worker getWorkerByIDNumber(String IDNumber);
	
}
