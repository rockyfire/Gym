package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import com.gymsystem.dao.GameApplyDao;
import com.gymsystem.po.GameApply;

public class GameApplyDaoImpl extends BaseDaoImpl<GameApply> implements GameApplyDao{

	@Override
	public GameApply getGameApplyByNumber(String number) {
		String hql = "from GameApply as g where g.gameApplyNumber=?";
		List<GameApply> gameApplies = (List<GameApply>) this.getHibernateTemplate().find(hql, number);
		if (gameApplies!=null&&gameApplies.size()>0) {
			return gameApplies.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<GameApply> getGameApplies(Map<String, String> queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

}
