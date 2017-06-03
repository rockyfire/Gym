package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

public class AnnounceComment implements Serializable {

	private Integer AnnounceComment_id;
	
	private String AnnounceCommentNumber;
	private String commentContent;
	private Date commentTime;
	
	private User commenter;
	private Announcement announcement ;
	
	
	public AnnounceComment() {
		// TODO Auto-generated constructor stub
	}
	
	public AnnounceComment(Integer announceComment_id, String announceCommentNumber) {
		super();
		AnnounceComment_id = announceComment_id;
		AnnounceCommentNumber = announceCommentNumber;
	}
	
	public Integer getAnnounceComment_id() {
		return AnnounceComment_id;
	}
	public void setAnnounceComment_id(Integer announceComment_id) {
		AnnounceComment_id = announceComment_id;
	}
	public String getAnnounceCommentNumber() {
		return AnnounceCommentNumber;
	}
	public void setAnnounceCommentNumber(String announceCommentNumber) {
		AnnounceCommentNumber = announceCommentNumber;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public User getCommenter() {
		return commenter;
	}
	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}
	public Announcement getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}
	@Override
	public String toString() {
		return "AnnounceComment [AnnounceComment_id=" + AnnounceComment_id + ", AnnounceCommentNumber="
				+ AnnounceCommentNumber + ", commentContent=" + commentContent + ", commentTime=" + commentTime
				+ ", commenter=" + commenter + ", announcement=" + announcement + "]";
	}
	
	
	
	
}
