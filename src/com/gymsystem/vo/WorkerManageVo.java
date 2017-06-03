package com.gymsystem.vo;

import java.util.Date;

public class WorkerManageVo {

	private String workerNumber;
	private String location;
	private Date   workerTime;
	private String description;
	
	public WorkerManageVo() {
		// TODO Auto-generated constructor stub
	}

	public WorkerManageVo(String workerNumber, String location, Date workerTime, String description) {
		super();
		this.workerNumber = workerNumber;
		this.location = location;
		this.workerTime = workerTime;
		this.description = description;
	}

	public String getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(String workerNumber) {
		this.workerNumber = workerNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getWorkerTime() {
		return workerTime;
	}

	public void setWorkerTime(Date workerTime) {
		this.workerTime = workerTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WorkerManage [workerNumber=" + workerNumber + ", location=" + location + ", workerTime=" + workerTime
				+ ", description=" + description + "]";
	}
	
}
