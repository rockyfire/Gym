package com.gymsystem.dao;

import com.gymsystem.po.Station;

public interface StationDao extends BaseDao<Station> {

	public Station getStationByNumber(String number);
	
	public Station getStationByName(String name);
}
