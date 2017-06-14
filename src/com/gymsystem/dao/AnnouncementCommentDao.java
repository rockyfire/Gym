package com.gymsystem.dao;

import com.gymsystem.po.AnnounceComment;

public interface AnnouncementCommentDao extends BaseDao<AnnounceComment> {

	public AnnounceComment getAnnounceCommentByNumber(String number);
	
}
