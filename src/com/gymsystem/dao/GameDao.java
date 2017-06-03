package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import com.gymsystem.po.Game;

public interface GameDao extends BaseDao<Game> {

	/**
	 * Ä£ºý²éÑ¯
	 * 
	 * @param queryCondition
	 * @return
	 */
	public List<Game> getGames(Map<String,String> queryCondition);
	
	public Game getGameByNubmer(String number);
	
	public List<Game> getGameByType(String type);

	public Game getGameByName(String name);
	
}
