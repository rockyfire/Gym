package com.gymsystem.vo;

import java.util.Date;

public class WorkerVo {

	private String workerNumber;
	private String email;
	private String IDNumber;
	private String state;
	private String stateNumber;
	private Date   entryTime;
	private Date   dimissioinTime;		//¿Î÷∞ ±º‰
	
	public WorkerVo() {
		// TODO Auto-generated constructor stub
	}

	public WorkerVo(String workerNumber, String email, String iDNumber, String state, String stateNumber,
			Date entryTime, Date dimissioinTime) {
		super();
		this.workerNumber = workerNumber;
		this.email = email;
		IDNumber = iDNumber;
		this.state = state;
		this.stateNumber = stateNumber;
		this.entryTime = entryTime;
		this.dimissioinTime = dimissioinTime;
	}

	public String getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(String workerNumber) {
		this.workerNumber = workerNumber;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateNumber() {
		return stateNumber;
	}

	public void setStateNumber(String stateNumber) {
		this.stateNumber = stateNumber;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Date getDimissioinTime() {
		return dimissioinTime;
	}

	public void setDimissioinTime(Date dimissioinTime) {
		this.dimissioinTime = dimissioinTime;
	}

	@Override
	public String toString() {
		return "WorkerVo [workerNumber=" + workerNumber + ", email=" + email + ", IDNumber=" + IDNumber + ", state="
				+ state + ", stateNumber=" + stateNumber + ", entryTime=" + entryTime + ", dimissioinTime="
				+ dimissioinTime + "]";
	}
	
	
}
