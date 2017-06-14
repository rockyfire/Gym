package com.gymsystem.po;

import java.util.ArrayList;
import java.util.List;

public class GameResource {

	private Integer gameResource_id;
	
	private String gameResourceNumber;
	
	private GameApply gameApply;
	private EquipmentRent equipmentRent;
	private List<GroundRent>groundRents = new ArrayList<>();
	
	@Override
	public String toString() {
		return "GameResource [gameResource_id=" + gameResource_id + ", gameResourceNumber=" + gameResourceNumber
				+ ", gameApply=" + gameApply + ", equipmentRent=" + equipmentRent + ", groundRents=" + groundRents
				+ "]";
	}
	public Integer getGameResource_id() {
		return gameResource_id;
	}
	public void setGameResource_id(Integer gameResource_id) {
		this.gameResource_id = gameResource_id;
	}
	public String getGameResourceNumber() {
		return gameResourceNumber;
	}
	public void setGameResourceNumber(String gameResourceNumber) {
		this.gameResourceNumber = gameResourceNumber;
	}
	public GameApply getGameApply() {
		return gameApply;
	}
	public void setGameApply(GameApply gameApply) {
		this.gameApply = gameApply;
	}
	public EquipmentRent getEquipmentRent() {
		return equipmentRent;
	}
	public void setEquipmentRent(EquipmentRent equipmentRent) {
		this.equipmentRent = equipmentRent;
	}
	public List<GroundRent> getGroundRents() {
		return groundRents;
	}
	public void setGroundRents(List<GroundRent> groundRents) {
		this.groundRents = groundRents;
	}
	
	
	public GameResource() {
		// TODO Auto-generated constructor stub
	}
	
	public GameResource(Integer gameResource_id, String gameResourceNumber, GameApply gameApply,
			EquipmentRent equipmentRent, List<GroundRent> groundRents) {
		super();
		this.gameResource_id = gameResource_id;
		this.gameResourceNumber = gameResourceNumber;
		this.gameApply = gameApply;
		this.equipmentRent = equipmentRent;
		this.groundRents = groundRents;
	}
	
	
}
