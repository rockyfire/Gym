package com.gymsystem.po;

import java.util.Date;

/**
 * 
 * 赛事申请表
 * 
 * @author e.IT
 *
 */
public class GameApply {

	private Integer gameApply_id;
	
	private String gameApplyNumber;
	private String sponsor;		//主办方
	private String Approver;	//审批人
	private String approvalInstitude;//审批单位
	private String organizer;	//承办方
	private Date   applyTime;   //申请时间
	
	private User appler;	//申请人
	private Game game;
	private GameResource gameResource;
	
	@Override
	public String toString() {
		return "GameApply [gameApply_id=" + gameApply_id + ", gameApplyNumber=" + gameApplyNumber + ", sponsor="
				+ sponsor + ", Approver=" + Approver + ", approvalInstitude=" + approvalInstitude + ", organizer="
				+ organizer + ", applyTime=" + applyTime + ", appler=" + appler + ", game=" + game + ", gameResource="
				+ gameResource + "]";
	}
	public Integer getGameApply_id() {
		return gameApply_id;
	}
	public void setGameApply_id(Integer gameApply_id) {
		this.gameApply_id = gameApply_id;
	}
	public String getGameApplyNumber() {
		return gameApplyNumber;
	}
	public void setGameApplyNumber(String gameApplyNumber) {
		this.gameApplyNumber = gameApplyNumber;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getApprover() {
		return Approver;
	}
	public void setApprover(String approver) {
		Approver = approver;
	}
	public String getApprovalInstitude() {
		return approvalInstitude;
	}
	public void setApprovalInstitude(String approvalInstitude) {
		this.approvalInstitude = approvalInstitude;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public User getAppler() {
		return appler;
	}
	public void setAppler(User appler) {
		this.appler = appler;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public GameResource getGameResource() {
		return gameResource;
	}
	public void setGameResource(GameResource gameResource) {
		this.gameResource = gameResource;
	}
	
	public GameApply() {
		// TODO Auto-generated constructor stub
	}
	
	public GameApply(Integer gameApply_id, String gameApplyNumber, String sponsor, String approver,
			String approvalInstitude, String organizer, Date applyTime, User appler, Game game,
			GameResource gameResource) {
		super();
		this.gameApply_id = gameApply_id;
		this.gameApplyNumber = gameApplyNumber;
		this.sponsor = sponsor;
		Approver = approver;
		this.approvalInstitude = approvalInstitude;
		this.organizer = organizer;
		this.applyTime = applyTime;
		this.appler = appler;
		this.game = game;
		this.gameResource = gameResource;
	}
	
}
