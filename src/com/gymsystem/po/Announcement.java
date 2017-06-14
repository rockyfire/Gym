package com.gymsystem.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Announcement implements Serializable {

	private Integer announcement_id;
	
	private String announcementNumber;
	private String type;
	private Date announceTime;
	private String content;
	
	private User annoucer;		//公告发布人
	private List<AnnounceComment>announceComments = new ArrayList<>();
	
	
	public Announcement() {
		// TODO Auto-generated constructor stub
	}
	
	public Announcement(Integer announcement_id, String announcementNumber, String type, Date announceTime,
			String content) {
		super();
		this.announcement_id = announcement_id;
		this.announcementNumber = announcementNumber;
		this.type = type;
		this.announceTime = announceTime;
		this.content = content;
	}
	public Integer getAnnouncement_id() {
		return announcement_id;
	}
	public void setAnnouncement_id(Integer announcement_id) {
		this.announcement_id = announcement_id;
	}
	public String getAnnouncementNumber() {
		return announcementNumber;
	}
	public void setAnnouncementNumber(String announcementNumber) {
		this.announcementNumber = announcementNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getAnnounceTime() {
		return announceTime;
	}
	public void setAnnounceTime(Date announceTime) {
		this.announceTime = announceTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getAnnoucer() {
		return annoucer;
	}
	public void setAnnoucer(User annoucer) {
		this.annoucer = annoucer;
	}
	public List<AnnounceComment> getAnnounceComments() {
		return announceComments;
	}
	public void setAnnounceComments(List<AnnounceComment> announceComments) {
		this.announceComments = announceComments;
	}
	@Override
	public String toString() {
		return "Announcement [announcement_id=" + announcement_id + ", announcementNumber=" + announcementNumber
				+ ", type=" + type + ", announceTime=" + announceTime + ", content=" + content + ", annoucer="
				+ annoucer + ", announceComments=" + announceComments + "]";
	}
	
	
	
	
}
