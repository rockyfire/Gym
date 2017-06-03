package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import com.gymsystem.dao.GroundDao;
import com.gymsystem.dao.GroundRentDao;
import com.gymsystem.po.Ground;
import com.gymsystem.po.GroundRent;

public class GroundRentDaoImpl extends BaseDaoImpl<GroundRent> implements GroundRentDao {

	@Override
	public GroundRent getGroundRentByNumber(String groundNumber) {
		String hql = "from GroundRent as g where g.groundRend_number=?";
		List<GroundRent> groundRents = (List<GroundRent>) this.getHibernateTemplate().find(hql, groundNumber);
		if (groundRents!=null&&groundRents.size()>0) {
			return groundRents.get(0);
		}else {
			return null;
		}
	}
}
