package com.gymsystem.po;

import java.util.Date;

public class Game {

	private Integer game_id;
	
	private String gameNumber;
	private String players;		//参赛人员名单
	private String descript;	//赛事描述
	private String type;
	private String location ;	//地点
	private Date   date;
	private String gameName; 	//赛事名称
	
	private GameApply gameApply;

	

	@Override
	public String toString() {
		return "Game [game_id=" + game_id + ", gameNumber=" + gameNumber + ", players=" + players + ", descript="
				+ descript + ", type=" + type + ", location=" + location + ", date=" + date + ", gameName=" + gameName
				+ ", gameApply=" + gameApply + "]";
	}

	public Integer getGame_id() {
		return game_id;
	}

	public void setGame_id(Integer game_id) {
		this.game_id = game_id;
	}

	public String getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(String gameNumber) {
		this.gameNumber = gameNumber;
	}

	public String getPlayers() {
		return players;
	}

	public void setPlayers(String players) {
		this.players = players;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public GameApply getGameApply() {
		return gameApply;
	}

	public void setGameApply(GameApply gameApply) {
		this.gameApply = gameApply;
	}

	public Game() {
		// TODO Auto-generated constructor stub
	}
	
	public Game(Integer game_id, String gameNumber, String players, String descript, String type, String location,
			Date date, String gameName, GameApply gameApply) {
		super();
		this.game_id = game_id;
		this.gameNumber = gameNumber;
		this.players = players;
		this.descript = descript;
		this.type = type;
		this.location = location;
		this.date = date;
		this.gameName = gameName;
		this.gameApply = gameApply;
	}

}
