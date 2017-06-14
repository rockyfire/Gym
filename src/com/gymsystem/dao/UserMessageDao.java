package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.gymsystem.po.UserMessage;

@Component
public interface UserMessageDao extends BaseDao<UserMessage> {

	/**
	 * 
	 * ʵ��ģ����ѯ
	 * 
	 * @param queryCondition  ��ѯ��������
	 * @return	�����û���Ϣ�б�
	 */
	public List<UserMessage> getUserMessage(Map<String,Object>queryCondition);
	
	public UserMessage getUserMessageByNumber(String number);
	
	public UserMessage getUserMessageByIDNumber(String IDNumber);
	
	public UserMessage getUserMessageByName(String name);
	
}
