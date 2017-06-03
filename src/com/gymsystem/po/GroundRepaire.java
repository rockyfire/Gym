package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * 场地维修表
 * 
 * @author e.IT
 *
 */
public class GroundRepaire implements Serializable {

	private Integer groundRepaire_id;
	private String repairedNumber;		//维修号
	private String repairedDescript;
	private Date   repairedDate ;
	private long repairedPay;			//维修支出
	
	private Ground ground;
	private TradeCard tradeCard;		//维护产生费用
	private List<WorkManage>workManages = new ArrayList<>();//安排多个人维修
	
	
	public GroundRepaire() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public String toString() {
		return "GroundRepaire [groundRepaire_id=" + groundRepaire_id + ", repairedNumber=" + repairedNumber
				+ ", repairedDescript=" + repairedDescript + ", repairedDate=" + repairedDate + ", repairedPay="
				+ repairedPay + ", ground=" + ground + ", tradeCard=" + tradeCard + ", workManages=" + workManages
				+ "]";
	}




	public Date getRepairedDate() {
		return repairedDate;
	}

	public void setRepairedDate(Date repairedDate) {
		this.repairedDate = repairedDate;
	}

	public Integer getGroundRepaire_id() {
		return groundRepaire_id;
	}
	public void setGroundRepaire_id(Integer groundRepaire_id) {
		this.groundRepaire_id = groundRepaire_id;
	}
	public String getRepairedNumber() {
		return repairedNumber;
	}
	public void setRepairedNumber(String repairedNumber) {
		this.repairedNumber = repairedNumber;
	}
	public String getRepairedDescript() {
		return repairedDescript;
	}
	public void setRepairedDescript(String repairedDescript) {
		this.repairedDescript = repairedDescript;
	}
	public long getRepairedPay() {
		return repairedPay;
	}
	public void setRepairedPay(long repairedPay) {
		this.repairedPay = repairedPay;
	}
	public Ground getGround() {
		return ground;
	}
	public void setGround(Ground ground) {
		this.ground = ground;
	}
	public TradeCard getTradeCard() {
		return tradeCard;
	}
	public void setTradeCard(TradeCard tradeCard) {
		this.tradeCard = tradeCard;
	}
	public List<WorkManage> getWorkManages() {
		return workManages;
	}
	public void setWorkManages(List<WorkManage> workManages) {
		this.workManages = workManages;
	}




	public GroundRepaire(String repairedNumber, String repairedDescript, Date repairedDate, long repairedPay) {
		super();
		this.repairedNumber = repairedNumber;
		this.repairedDescript = repairedDescript;
		this.repairedDate = repairedDate;
		this.repairedPay = repairedPay;
	}
	
	
	
	
}
