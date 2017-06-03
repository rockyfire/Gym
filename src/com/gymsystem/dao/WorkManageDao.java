package com.gymsystem.dao;

import java.util.List;

import com.gymsystem.po.WorkManage;

public interface WorkManageDao extends BaseDao<WorkManage> {

	public WorkManage getWorkManageByNumber(String number);
	
	public List<WorkManage> getWorkManageByType(String type);
	
	
}
