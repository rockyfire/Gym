package com.gymsystem.service;

import java.util.List;

import com.gymsystem.po.Role;
import com.gymsystem.vo.AuthorityVo;
import com.gymsystem.vo.UserMessageVo;
import com.gymsystem.vo.UserVo;

/**
 * 
 * �����û���ص�ҵ��
 * 
 * 
 * @author e.IT
 *
 */
public interface UserService {

	public boolean login(UserVo userVo);
	
	/**
	 * �û�ע��
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
	 * �����ѯ����
	 * 
	 * @param userVo
	 * @return
	 */
	public List<UserVo> queryUser(UserVo userVo);
	
	/**
	 * 
	 * �����û��б�
	 * @param rolesNumber ��ɫ�ı������
	 * @param userVo	    ��ǰ�û�
	 */
	public void updateUserAuthority(String[]rolesNumber,String userNumber);
	
	
}



