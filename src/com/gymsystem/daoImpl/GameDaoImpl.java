package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import com.gymsystem.dao.GameDao;
import com.gymsystem.po.Game;

public class GameDaoImpl extends BaseDaoImpl<Game> implements GameDao{

	@Override
	public List<Game> getGames(Map<String, String> queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game getGameByNubmer(String number) {
		String hql = "from Game as g where g.gameNumber=?";
		List<Game> games = (List<Game>) this.getHibernateTemplate().find(hql, number);
		if (games!=null&&games.size()>0) {
			return games.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<Game> getGameByType(String type) {
		String hql = "from Game as g where g.type=?";
		List<Game> games = (List<Game>) this.getHibernateTemplate().find(hql, type);
		if (games!=null&&games.size()>0) {
			return games;
		}else {
			return null;
		}
	}

	@Override
	public Game getGameByName(String name) {
		String hql = "from Game as g where g.gameName=?";
		List<Game> games = (List<Game>) this.getHibernateTemplate().find(hql, name);
		if (games!=null&&games.size()>0) {
			return games.get(0);
		}else {
			return null;
		}
	}

}
