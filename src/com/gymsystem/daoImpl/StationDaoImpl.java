package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.StationDao;
import com.gymsystem.po.Station;

public class StationDaoImpl extends BaseDaoImpl<Station> implements StationDao{

	@Override
	public Station getStationByNumber(String number) {
		String hql = "from Station as s where s.stationNumber=?";
		List<Station> stations = (List<Station>) this.getHibernateTemplate().find(hql, number);
		if (stations!=null&&stations.size()>0) {
			return stations.get(0);
		}else {
			return null;
		}
	}

	@Override
	public Station getStationByName(String name) {
		String hql = "from Station as s where s.stationName=?";
		List<Station> stations = (List<Station>) this.getHibernateTemplate().find(hql, name);
		if (stations!=null&&stations.size()>0) {
			return stations.get(0);
		}else {
			return null;
		}
	}

}
