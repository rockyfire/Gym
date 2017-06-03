package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.AnnouncementVo;

public interface AnnouncementService {

	public List<AnnouncementVo> getAnnouncements();
	
	public boolean addAnnouncement(AnnouncementVo announcementVo);
	
	public boolean deleteAnnouncement(AnnouncementVo announcementVo);
}
