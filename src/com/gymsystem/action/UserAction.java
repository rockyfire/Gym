package com.gymsystem.action;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;

import com.gymsystem.service.UserService;
import com.gymsystem.vo.UserMessageVo;
import com.gymsystem.vo.UserVo;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends BaseAction<UserVo>{

	private UserVo userVo;
	private String userNumber;
	
	
	public String userAuthority(){
		
		return "userAuthority";
	}
	
	
	
	public String addUser(){
		userService.addUser(userVo);
		System.out.println(userVo.getUserName());
		list = userService.getUsers();
		request.put("users", list);
		return "addUser_success";
	}
	
	
	public String deleteUser(){
		System.out.println("delete user");
		System.out.println(userVo.getUserNubmer());
		userService.deleteUser(userVo);
		list = userService.getUsers();
		request.put("users", list);
		return "deleteUser_success";
	}
	
	public String updateUser(){
		System.out.println("updateUser");
		System.out.println(userVo.getUserNubmer());
		userService.updateUser(userVo);
		list = userService.getUsers();
		request.put("users", list);
		return "updateUser_success";
	}
	
	
	public String login(){
			userService.login(userVo);
			list = userService.getUsers();
			request.put("users", list);
			System.out.println(list.toString());
			return "login_success";
	}
	
	
	public String userDetails(){
		System.out.println(userNumber);
		UserVo userVo = userService.getUserByNumber(userNumber);
		System.out.println(userVo.getUserName()+"+++++++++++++++++");
		list.add(userVo);
		System.out.println(userVo.toString());
		return "userDetails_success";
	}
	
	
	public String toUserAuthority(){
		list = userService.getUsers();
		request.put("users", list);
		System.out.println("toUserAUthority_success");
		return "toUserAUthority_success";
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


	
	
	
	public UserVo getUserVo() {
		return userVo;
	}
	
	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}

	

}
