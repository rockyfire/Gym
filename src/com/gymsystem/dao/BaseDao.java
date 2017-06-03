package com.gymsystem.dao;

import java.util.List;

public interface BaseDao <T>{

	public void save(T object);
	
	public void update(T object);
	
	public void delete(Integer id);
	
	public T get(Integer id);
	
	/**
	 * ��ȡ�����б�
	 * @return
	 */
	public List<T> query();
}
