package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import com.gymsystem.dao.WorkerDao;
import com.gymsystem.po.Worker;

public class WorkerDaoImpl extends BaseDaoImpl<Worker> implements WorkerDao {

	@Override
	public List<Worker> getWorkers(Map<String, String> queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Worker getWorkerByNumber(String number) {
		String hql = "from Worker as w where w.workerNumber=?";
		List<Worker> workers = (List<Worker>) this.getHibernateTemplate().find(hql, number);
		if (workers!=null&&workers.size()>0) {
			return workers.get(0);
		}else {
			return null;
		}
	}

	@Override
	public Worker getWorkerByIDNumber(String IDNumber) {
		String hql = "from Worker as w where w.IDNumber=?";
		List<Worker> workers = (List<Worker>) this.getHibernateTemplate().find(hql, IDNumber);
		if (workers!=null&&workers.size()>0) {
			return workers.get(0);
		}else {
			return null;
		}
	}

}
