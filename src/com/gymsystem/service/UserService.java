package com.gymsystem.service;

import java.util.List;

import com.gymsystem.po.Role;
import com.gymsystem.vo.AuthorityVo;
import com.gymsystem.vo.UserMessageVo;
import com.gymsystem.vo.UserVo;

/**
 * 
 * 处理用户相关的业务
 * 
 * 
 * @author e.IT
 *
 */
public interface UserService {

	public boolean login(UserVo userVo);
	
	/**
	 * 用户注册
	 * 
	 * @param userVo
	 * @return
	 */
	public boolean regist(UserVo userVo);
	
	
	public boolean updateUser(UserMessageVo userMessageVo);
	
	
	public boolean updateUser(UserVo userVo);
	
	
	public boolean deleteUser(UserVo userVo);
	
	
	public List<UserVo> getUsers();
	
	
	public UserVo getUserByNumber(String userNumber);
	
	public boolean addUser(UserVo userVo);
	
	/**
	 * 输入查询条件
	 * 
	 * @param userVo
	 * @return
	 */
	public List<UserVo> queryUser(UserVo userVo);
	
	/**
	 * 
	 * 更新用户列表
	 * @param rolesNumber 角色的编号数组
	 * @param userVo	    当前用户
	 */
	public void updateUserAuthority(String[]rolesNumber,String userNumber);
	
	
}



