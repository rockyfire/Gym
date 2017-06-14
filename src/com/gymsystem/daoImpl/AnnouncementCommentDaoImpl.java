package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.AnnouncementCommentDao;
import com.gymsystem.po.AnnounceComment;

public class AnnouncementCommentDaoImpl extends BaseDaoImpl<AnnounceComment> implements AnnouncementCommentDao{

	@Override
	public AnnounceComment getAnnounceCommentByNumber(String number) {
		String hql  = "from AnnounceComment as a where a.AnnounceCommentNumber=?";
		List<AnnounceComment> announceComments = (List<AnnounceComment>) this.getHibernateTemplate().find(hql, number);
		if (announceComments!=null&&announceComments.size()>0) {
			return announceComments.get(0);
		}else {
			return null;
		}
	}
}
