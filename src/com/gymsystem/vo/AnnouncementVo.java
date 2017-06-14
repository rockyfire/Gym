package com.gymsystem.vo;

import java.util.Date;

public class AnnouncementVo {

	private String announcementNumber;
	private String title;
	private String content;
	private String announcer;	//∑¢≤º»À£ª
	private Date   announceTime;
	
	public AnnouncementVo() {
		// TODO Auto-generated constructor stub
	}
	
	public AnnouncementVo(String announcementNumber, String title, String content, String announcer,
			Date announceTime) {
		super();
		this.announcementNumber = announcementNumber;
		this.title = title;
		this.content = content;
		this.announcer = announcer;
		this.announceTime = announceTime;
	}
	@Override
	public String toString() {
		return "AnnouncementVo [announcementNumber=" + announcementNumber + ", title=" + title + ", content=" + content
				+ ", announcer=" + announcer + ", announceTime=" + announceTime + "]";
	}
	public String getAnnouncementNumber() {
		return announcementNumber;
	}
	public void setAnnouncementNumber(String announcementNumber) {
		this.announcementNumber = announcementNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAnnouncer() {
		return announcer;
	}
	public void setAnnouncer(String announcer) {
		this.announcer = announcer;
	}
	public Date getAnnounceTime() {
		return announceTime;
	}
	public void setAnnounceTime(Date announceTime) {
		this.announceTime = announceTime;
	}
	
	
	
	
}
