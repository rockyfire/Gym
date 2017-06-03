package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.gymsystem.dao.UserMessageDao;
import com.gymsystem.po.UserMessage;

@Component
public class UserMessageDaoImpl extends BaseDaoImpl<UserMessage> implements UserMessageDao{

	@Override
	public List<UserMessage> getUserMessage(Map<String, Object> queryCondition) {
		
		return null;
	}

	@Override
	public UserMessage getUserMessageByNumber(String number) {
		String hql = "from UserMessage u where u.userNumber=?";
		List<UserMessage> userMessages = (List<UserMessage>) this.getHibernateTemplate().find(hql, number);
		if (userMessages!=null&&userMessages.size()>0) {
			return userMessages.get(0);
		}else {
			return null;
		}
	}

	@Override
	public UserMessage getUserMessageByIDNumber(String IDNumber) {
		String hql = "from UserMessage u where u.IDNumber=?";
		List<UserMessage> userMessages = (List<UserMessage>) this.getHibernateTemplate().find(hql, IDNumber);
		if (userMessages!=null&&userMessages.size()>0) {
			return userMessages.get(0);
		}else {
			return null;
		}
	}

	@Override
	public UserMessage getUserMessageByName(String name) {
		String hql = "from UserMessage u where u.userName=?";
		List<UserMessage> userMessages = (List<UserMessage>) this.getHibernateTemplate().find(hql, name);
		if (userMessages!=null&&userMessages.size()>0) {
			return userMessages.get(0);
		}else {
			return null;
		}
	}
}
