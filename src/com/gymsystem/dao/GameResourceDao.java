package com.gymsystem.dao;

import com.gymsystem.po.GameResource;

public interface GameResourceDao extends BaseDao<GameResource> {

	public GameResource getGameResourceByNumber(String number);
	
}
