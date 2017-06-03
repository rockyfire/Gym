package com.gymsystem.vo;

import java.util.Date;

public class GroundRepairVo {

	private String GroundRepairNumber;
	private String description;				//ά�޳�������
	private long   repairPay;
	private Date   repairTime;				
	private String workers;					//ά����Ա
	
	public GroundRepairVo() {
		// TODO Auto-generated constructor stub
	}

	public GroundRepairVo(String groundRepairNumber, String description, long repairPay, Date repairTime,
			String workers) {
		super();
		GroundRepairNumber = groundRepairNumber;
		this.description = description;
		this.repairPay = repairPay;
		this.repairTime = repairTime;
		this.workers = workers;
	}

	public String getGroundRepairNumber() {
		return GroundRepairNumber;
	}

	public void setGroundRepairNumber(String groundRepairNumber) {
		GroundRepairNumber = groundRepairNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getRepairPay() {
		return repairPay;
	}

	public void setRepairPay(long repairPay) {
		this.repairPay = repairPay;
	}

	public Date getRepairTime() {
		return repairTime;
	}

	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}

	public String getWorkers() {
		return workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
	}

	@Override
	public String toString() {
		return "GroundRepairVo [GroundRepairNumber=" + GroundRepairNumber + ", description=" + description
				+ ", repairPay=" + repairPay + ", repairTime=" + repairTime + ", workers=" + workers + "]";
	}
	
	
}
