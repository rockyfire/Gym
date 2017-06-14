package com.gymsystem.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.enterprise.inject.New;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.http.HttpRequest;

import com.gymsystem.dao.UserDao;
import com.gymsystem.service.EquipmentService;
import com.gymsystem.service.UserService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.EquipmentVo;
import com.gymsystem.vo.UserVo;
import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport implements SessionAware,
		ServletRequestAware {

	private List<UserVo> list = new ArrayList<>();
	private String userNumber;
	private UserVo userVo;

	protected Map<String, Object> sessison;

	@Resource
	private UserService userService;

	public String testJson() {
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

	/* #################################################### */

	private String result;

	@Resource
	protected EquipmentService equipmentService;

	protected HttpServletRequest requesthttp;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		requesthttp = arg0;
	}

	public String ajaxJson() {
		try {
			String name = requesthttp.getParameter("equipmentName");
			List<EquipmentVo> equipmentVo = equipmentService
					.ajaxqueryEquipment(name);

			Map<String, Object> map = new HashMap<String, Object>();
			Double rent = equipmentVo.get(0).getRentRate();
			int number = equipmentVo.get(0).getIdleNumber();
			map.put("rentRate", rent);
			map.put("idleNumber", number);

			JSONObject object = JSONObject.fromObject(map);
			result = object.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
