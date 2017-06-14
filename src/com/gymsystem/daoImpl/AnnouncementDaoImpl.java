package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.AnnouncementDao;
import com.gymsystem.po.Announcement;

public class AnnouncementDaoImpl extends BaseDaoImpl<Announcement> implements AnnouncementDao{

	@Override
	public Announcement getAnnouncementByNumber(String number) {
		String hql = "from Announcement as a where a.announcementNumber=?";
		List<Announcement> Announcements = (List<Announcement>) this.getHibernateTemplate().find(hql, number);
		if (Announcements!=null&&Announcements.size()>0) {
			return Announcements.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<Announcement> getAnnouncementByType(String type) {
		String hql = "from Announcement as a where a.type=?";
		@SuppressWarnings("unchecked")
		List<Announcement> Announcements = (List<Announcement>) this.getHibernateTemplate().find(hql, type);
		if (Announcements!=null&&Announcements.size()>0) {
			return Announcements;
		}else{
			return null;
		}
	}
}
