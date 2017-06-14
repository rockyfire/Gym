package com.gymsystem.action;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.json.annotations.JSON;

import com.gymsystem.dao.GroundRentDao;
import com.gymsystem.service.EquipmentService;
import com.gymsystem.service.GroundService;
import com.gymsystem.service.RoleResourceService;
import com.gymsystem.service.RoleService;
import com.gymsystem.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction <T> extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {

	
	
	
	//ҵ��ӿ�
	@Resource
	protected UserService userService;
	
	@Resource
	protected RoleService roleService;
	
	@Resource
	protected GroundService groundService;
	
	@Resource(name="roleResourceServiceImpl")
	protected RoleResourceService roleResourceService;
	@Resource
	protected EquipmentService equipmentService;

	
	
//	
	
	protected List<T> list = new ArrayList<>();
	
	
	
	//�����
	protected Map<String,Object> request;
	protected Map<String,Object> session;
	protected Map<String,Object> application;
	
//	protected T model;
//	
//	@Override
//	public T getModel() {
//		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
//		Class clazz = (Class)type.getActualTypeArguments()[0];
//		try {
//			model = (T)clazz.newInstance();
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}	
//		return model;
//	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<T> getList() {
		return list;
	}
	
	
}
