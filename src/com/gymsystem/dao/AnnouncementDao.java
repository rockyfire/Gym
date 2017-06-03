package com.gymsystem.dao;

import java.util.List;

import com.gymsystem.po.Announcement;

public interface AnnouncementDao extends BaseDao<Announcement> {

	public Announcement getAnnouncementByNumber(String number);
	
	public List<Announcement> getAnnouncementByType(String type);
	
}
