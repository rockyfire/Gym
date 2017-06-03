package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.WorkManageDao;
import com.gymsystem.dao.WorkerDao;
import com.gymsystem.po.WorkManage;

public class WorkManageDaoImpl extends BaseDaoImpl<WorkManage> implements WorkManageDao{

	@Override
	public WorkManage getWorkManageByNumber(String number) {
		String hql = "from WorkManage as w where w.manageNumber=?";
		List<WorkManage> workManages = (List<WorkManage>) this.getHibernateTemplate().find(hql, number);
		if (workManages!=null&&workManages.size()>0) {
			return workManages.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<WorkManage> getWorkManageByType(String type) {
		String hql = "from WorkManage as w where w.type=?";
		List<WorkManage> workManages = (List<WorkManage>) this.getHibernateTemplate().find(hql, type);
		if (workManages!=null&&workManages.size()>0) {
			return workManages;
		}else {
			return null;
		}
	}

}
