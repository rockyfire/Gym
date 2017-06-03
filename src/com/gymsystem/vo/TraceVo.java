package com.gymsystem.vo;

import java.util.Date;

public class TraceVo {

	private String traceNumber;
	private String type;
	private long account;	//交易金额
	private Date tradeTime;
	private String description;  //备注
	private String detailed;	 //交易详情
	
	
	public TraceVo() {
		// TODO Auto-generated constructor stub
	}


	public TraceVo(String traceNumber, String type, long account, Date tradeTime, String description, String detailed) {
		super();
		this.traceNumber = traceNumber;
		this.type = type;
		this.account = account;
		this.tradeTime = tradeTime;
		this.description = description;
		this.detailed = detailed;
	}


	public String getTraceNumber() {
		return traceNumber;
	}


	public void setTraceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public long getAccount() {
		return account;
	}


	public void setAccount(long account) {
		this.account = account;
	}


	public Date getTradeTime() {
		return tradeTime;
	}


	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDetailed() {
		return detailed;
	}


	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}


	@Override
	public String toString() {
		return "Trace [traceNumber=" + traceNumber + ", type=" + type + ", account=" + account + ", tradeTime="
				+ tradeTime + ", description=" + description + ", detailed=" + detailed + "]";
	}
	
	
	
	
}
