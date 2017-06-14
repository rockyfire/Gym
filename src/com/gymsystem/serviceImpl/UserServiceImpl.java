package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.RoleDao;
import com.gymsystem.dao.UserDao;
import com.gymsystem.dao.UserMessageDao;
import com.gymsystem.po.Role;
import com.gymsystem.po.User;
import com.gymsystem.po.UserMessage;
import com.gymsystem.service.UserService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.UserMessageVo;
import com.gymsystem.vo.UserVo;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

	
	private String msg;
	
	@Resource
	UserDao UserDao;
	@Resource
	UserMessageDao userMessageDao;
	@Resource
	RoleDao roledao;
	
	
	@Override
	public boolean login(UserVo userVo) {
		User user = UserDao.getUserByName(userVo.getUserName());
		try {
			if (user!=null&&userVo.getPassword()==user.getPassword()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = "登陆失败";
			return false;
		}
		return false;
	}

	@Override
	public boolean regist(UserVo userVo) {
		User user = UserDao.getUserByName(userVo.getUserName());
		User user2;
		if (user!=null) {
			msg = "该用户已经存在";
			return false;
		}else{
			//用户编号组成为：
			String userNubmer = MyUtil.createUserNumber();
			
			for(;UserDao.getUserByNumber(userNubmer)!=null;userNubmer = MyUtil.createUserNumber()){
				msg = "用户编号重复";
			}
			user2 = new User(userNubmer, userVo.getUserName(), userVo.getPassword());
  			try {
  				UserDao.addUser(user2);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
  			return true;
		}
	}

	
	
	@Override
	public boolean updateUser(UserVo userVo) {
		System.out.println(userVo.getUserNubmer());
		User user = UserDao.getUserByNumber(userVo.getUserNubmer());
		UserMessage userMessage = user.getUserMessage();
		
		user.setUsername(userVo.getUserName());
		user.setUserNumber(userVo.getUserNubmer());
		
		userMessage.setAddress(userVo.getLocation());
		userMessage.setBornDay(userVo.getBornDate());
		userMessage.seteMail(userVo.getEmail());
		userMessage.setGrade(userVo.getGrade());
		userMessage.setIDNumber(userVo.getIDNumber());
		userMessage.setUserName(userVo.getUserName());
		userMessage.setUserNumber(userVo.getUserNubmer());
		try {
			UserDao.update(user);
			userMessageDao.update(userMessage);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public boolean updateUser(UserMessageVo userMessageVo) {
		UserMessage userMessage = new UserMessage();
		userMessage.setAddress(userMessageVo.getLocation());
		userMessage.setBornDay(userMessageVo.getBornDate());
		userMessage.seteMail(userMessage.geteMail());
		userMessage.setGrade(userMessageVo.getGrade());
		userMessage.setIDNumber(userMessageVo.getIDNumber());
		userMessage.setUserNumber(userMessageVo.getUserNubmer());
		userMessage.setUserName(userMessageVo.getName());
		try {
			userMessageDao.update(userMessage);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteUser(UserVo userVo) {
		User user = UserDao.getUserByNumber(userVo.getUserNubmer());
		if (user!=null) {
			UserDao.delete(user.getUser_id());
			msg = "删除成功";
			return true;
		}else{
			msg = "没有该用户";
			return false;
		}
	}

	@Override
	public List<UserVo> getUsers() {
		List<User> users = UserDao.query();
		List<UserVo> userVos = new ArrayList<>();
		for(User user:users){
			UserVo userVo = new UserVo();
			userVo.setPassword(user.getPassword());
			userVo.setUserName(user.getUsername());
			userVo.setUserNubmer(user.getUserNumber());
			userVos.add(userVo);
		}
		return userVos;
	}

	@Override
	public UserVo getUserByNumber(String userNumber){
		System.out.println("userServiceImpl"+userNumber);
		User user = UserDao.getUserByNumber(userNumber);
		UserMessage userMessage = user.getUserMessage();
		UserVo userVo = new UserVo();
		
		if (userMessage==null) {
			userMessage = new UserMessage();
			user.setUserMessage(userMessage);
			UserDao.update(user);
		}
			userVo.setPassword(user.getPassword());
			userVo.setName(user.getUsername());
			userVo.setUserName(user.getUsername());
			userVo.setUserNubmer(userMessage.getUserNumber());
			userVo.setBornDate(userMessage.getBornDay());
			userVo.setEmail(userMessage.geteMail());
			System.out.println("email  :  "+userMessage.geteMail());
			userVo.setGrade(userMessage.getGrade());
			userVo.setIDNumber(userMessage.getIDNumber());
			userVo.setLocation(userMessage.getAddress());
		return userVo;
	}
	
	@Override
	public boolean addUser(UserVo userVo) {
		return regist(userVo);
	}
///////////////////////////////未完成
	@Override
	public List<UserVo> queryUser(UserVo userVo) {
		User user = new User();
		user.setUsername(userVo.getUserName());
		user.setPassword(userVo.getPassword());
		UserDao.queryUsers(user);
		return null;
	}

	@Override
	public void updateUserAuthority(String[]rolesNumber, String userNumber) {
		
		for(int i=0;i<rolesNumber.length;i++){
			User user = UserDao.getUserByNumber(userNumber);
			Role role = roledao.getRoleByNumber(rolesNumber[i]);
			user.getRoles().add(role);
			role.getUsers().add(user);
			roledao.update(role);
			UserDao.update(user);
		}
	}
	

	public UserDao getUserDao() {
		return UserDao;
	}

	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public UserMessageDao getUserMessageDao() {
		return userMessageDao;
	}

	public void setUserMessageDao(UserMessageDao userMessageDao) {
		this.userMessageDao = userMessageDao;
	}

	public RoleDao getRoledao() {
		return roledao;
	}
	public void setRoledao(RoleDao roledao) {
		this.roledao = roledao;
	}
	
	
}
