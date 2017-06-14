package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import com.gymsystem.dao.GroundDao;
import com.gymsystem.po.Ground;
import com.gymsystem.po.GroundRent;

public class GroundDaoImpl extends BaseDaoImpl<Ground> implements GroundDao{

	@Override
	public List<Ground> getGrounds(Map<String, String> queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ground getGroundByNumber(String groundNumber) {
		String hql = "from Ground as g where g.groundNumber=?";
		List<Ground> groundRents = (List<Ground>) this.getHibernateTemplate().find(hql, groundNumber);
		if (groundRents!=null&&groundRents.size()>0) {
			return groundRents.get(0);
		}else {
			return null;
		}
	}

	@Override
	public Ground getGroundByName(String GroundName) {
		String hql = "from Ground as g where g.groundName=?";
		List<Ground> groundRents = (List<Ground>) this.getHibernateTemplate().find(hql, GroundName);
		if (groundRents!=null&&groundRents.size()>0) {
			return groundRents.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<Ground> getUsableGrounds() {
		String hql = "from Ground as g where g.canUse=true";
		List<Ground> groundRents = (List<Ground>) this.getHibernateTemplate().find(hql);
		if (groundRents!=null&&groundRents.size()>0) {
			return groundRents;
		}else {
			return null;
		}
	}

}
