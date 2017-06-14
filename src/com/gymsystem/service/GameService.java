package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.GameVo;

public interface GameService {

	/**
	 * 
	 * »¸ ¬…Û∫À
	 * 
	 * @param gameVo
	 */
	public void verify(GameVo gameVo);
	
	
	public List<GameVo> queryGameVo(GameVo gameVo);
	
	
	public boolean gameApply(GameVo gameVo);
	
	
	public void deleteGame(GameVo gameVo);
	
	
	public void updateGame(GameVo gameVo);
	
}

