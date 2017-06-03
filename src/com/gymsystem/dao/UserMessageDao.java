package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.gymsystem.po.UserMessage;

@Component
public interface UserMessageDao extends BaseDao<UserMessage> {

	/**
	 * 
	 * 实现模糊查询
	 * 
	 * @param queryCondition  查询条件集合
	 * @return	返回用户信息列表
	 */
	public List<UserMessage> getUserMessage(Map<String,Object>queryCondition);
	
	public UserMessage getUserMessageByNumber(String number);
	
	public UserMessage getUserMessageByIDNumber(String IDNumber);
	
	public UserMessage getUserMessageByName(String name);
	
}
