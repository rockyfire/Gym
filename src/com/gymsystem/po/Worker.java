package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Default;

public class Worker implements Serializable {

	private Integer worker_id;
	private String workerNumber;
	private boolean sex ;		//true ÎªÄÐ£¬ false Îª Å®£»
	private int age;
	private String phone;
	private String email;
	private String IDNumber;
	private Date entryTime;
	private Date dimissionTime;
	
	private List<WorkManage>workManages = new ArrayList<>();
	private Station station;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Worker [worker_id=" + worker_id + ", workerNumber=" + workerNumber + ", sex=" + sex + ", age=" + age
				+ ", phone=" + phone + ", email=" + email + ", IDNumber=" + IDNumber + ", entryTime=" + entryTime
				+ ", dimissionTime=" + dimissionTime + ", workManages=" + workManages + ", station=" + station + "]";
	}
	public Integer getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(Integer worker_id) {
		this.worker_id = worker_id;
	}
	public String getWorkerNumber() {
		return workerNumber;
	}
	public void setWorkerNumber(String workerNumber) {
		this.workerNumber = workerNumber;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getDimissionTime() {
		return dimissionTime;
	}
	public void setDimissionTime(Date dimissionTime) {
		this.dimissionTime = dimissionTime;
	}
	public List<WorkManage> getWorkManages() {
		return workManages;
	}
	public void setWorkManages(List<WorkManage> workManages) {
		this.workManages = workManages;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public Worker(Integer worker_id, String workerNumber, boolean sex, int age, String phone, String email,
			String iDNumber, Date entryTime, Date dimissionTime) {
		super();
		this.worker_id = worker_id;
		this.workerNumber = workerNumber;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
		IDNumber = iDNumber;
		this.entryTime = entryTime;
		this.dimissionTime = dimissionTime;
	}
	
	
	
}
