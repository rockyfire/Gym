package com.gymsystem.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.enterprise.inject.New;

import org.apache.struts2.interceptor.SessionAware;

import com.gymsystem.dao.UserDao;
import com.gymsystem.service.UserService;
import com.gymsystem.vo.UserVo;
import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport implements SessionAware{

	
	private List<UserVo> list = new ArrayList<>();
	private String userNumber;
	private UserVo userVo;
	
	protected Map<String,Object> sessison;
	
	@Resource
	private UserService userService;
	
	public String testJson(){
		UserVo userVo = new UserVo();
		userVo.setIDNumber("234");
		list.add(userVo);
		
		
		System.out.println(userNumber);
		
		return "jsonSuccess";
	}
	
	
	
	public String getUserNumber() {
		return userNumber;
	}
	
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	public List<UserVo> getList() {
		return list;
	}
	
	public void setList(List<UserVo> list) {
		this.list = list;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.sessison = session;
		
	}
}

