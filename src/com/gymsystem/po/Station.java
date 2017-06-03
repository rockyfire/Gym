package com.gymsystem.po;

import java.io.Serializable;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;
import java.util.List;

public class Station implements Serializable {

	private Integer station_id;
	
	private String stationNumber;
	private String stationName;
	private String descript;		//岗位描述
	private String responsibility;	//岗位职责
	private long salary;
	
	private List<Worker>workers =new ArrayList<>();

	public Station() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	@Override
	public String toString() {
		return "Station [station_id=" + station_id + ", stationNumber=" + stationNumber + ", stationName=" + stationName
				+ ", descript=" + descript + ", responsibility=" + responsibility + ", salary=" + salary + ", workers="
				+ workers + "]";
	}





	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Integer getStation_id() {
		return station_id;
	}

	public void setStation_id(Integer station_id) {
		this.station_id = station_id;
	}

	public String getStationNumber() {
		return stationNumber;
	}

	public void setStationNumber(String stationNumber) {
		this.stationNumber = stationNumber;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}





	public Station(String stationNumber, String stationName, String descript, String responsibility, long salary) {
		super();
		this.stationNumber = stationNumber;
		this.stationName = stationName;
		this.descript = descript;
		this.responsibility = responsibility;
		this.salary = salary;
	}

	
}
