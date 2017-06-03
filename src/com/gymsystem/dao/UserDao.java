package com.gymsystem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gymsystem.po.User;
import com.gymsystem.vo.UserVo;

//@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public interface  UserDao extends BaseDao<User>{

	 public void addUser(User user);
	 
	 public List<User> queryUsers(User user);
	 
	 public User getUserByName(String username);
	 
	 public User getUserByNumber(String userNumber);
}
