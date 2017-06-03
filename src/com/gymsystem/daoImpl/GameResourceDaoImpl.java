package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.GameResourceDao;
import com.gymsystem.po.Game;
import com.gymsystem.po.GameResource;

public class GameResourceDaoImpl extends BaseDaoImpl<GameResource> implements GameResourceDao{

	@Override
	public GameResource getGameResourceByNumber(String number) {
		String hql = "from GameResource as g where g.gameResourceNumber=?";
		List<GameResource> gameResources = (List<GameResource>) this.getHibernateTemplate().find(hql, number);
		if (gameResources!=null&&gameResources.size()>0) {
			return gameResources.get(0);
		}else {
			return null;
		}
	}

}
