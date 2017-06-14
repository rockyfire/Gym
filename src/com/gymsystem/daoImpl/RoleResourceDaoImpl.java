package com.gymsystem.daoImpl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gymsystem.dao.RoleResourceDao;
import com.gymsystem.po.RoleResource;


@Component
public class RoleResourceDaoImpl extends BaseDaoImpl<RoleResource> implements RoleResourceDao {

	@Override
	public RoleResource getRoleResourceByNumber(String roleResourceNumber) {
		String hql = "from RoleResource as r where r.roleResourceNumber=?";
		List<RoleResource>roleResources = (List<RoleResource>) this.getHibernateTemplate().find(hql, roleResourceNumber);
		if (roleResources!=null&&roleResources.size()>0) {
			return roleResources.get(0);
		}else {
			return null;
		}
	}

	@Override
	public RoleResource getRoleResourceByName(String roleResourceName) {
		String hql = "from RoleResource as r where r.roleResourceName=?";
		List<RoleResource>roleResources = (List<RoleResource>) this.getHibernateTemplate().find(hql, roleResourceName);
		if (roleResources!=null&&roleResources.size()>0) {
			return roleResources.get(0);
		}else {
			return null;
		}
	}

}
