package com.gymsystem.dao;

import java.util.List;

public interface BaseDao <T>{

	public void save(T object);
	
	public void update(T object);
	
	public void delete(Integer id);
	
	public T get(Integer id);
	
	/**
	 * 获取数据列表
	 * @return
	 */
	public List<T> query();
}
