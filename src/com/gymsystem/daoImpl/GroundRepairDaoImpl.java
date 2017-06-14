package com.gymsystem.daoImpl;

import java.util.Date;
import java.util.List;

import com.gymsystem.dao.GroundRepairDao;
import com.gymsystem.po.GroundRepaire;

public class GroundRepairDaoImpl extends BaseDaoImpl<GroundRepaire> implements GroundRepairDao{

	@Override
	public GroundRepaire getGroundRepaireByNumber(String groundRepaireNumber) {
		String hql = "from GroundRepair as g where g.repairedNumber=?";
		List<GroundRepaire> groundRepaires = (List<GroundRepaire>) this.getHibernateTemplate().find(hql, groundRepaireNumber);
		if (groundRepaires!=null&&groundRepaires.size()>0) {
			return groundRepaires.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<GroundRepaire> getGroundRepaireByDate(Date date) {
		String hql = "from GroundRepair as g where g.repairedDate=?";
		List<GroundRepaire> groundRepaires = (List<GroundRepaire>) this.getHibernateTemplate().find(hql, date);
		if (groundRepaires!=null&&groundRepaires.size()>0) {
			return groundRepaires;
		}else{
			return null;
		}
	}

}
