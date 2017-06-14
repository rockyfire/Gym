package com.gymsystem.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.gymsystem.dao.RoleDao;
import com.gymsystem.po.Role;

@Component
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public RoleDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Role getRoleByName(String roleName) {
		String hql = "from Role as r where r.roleName=?";
		List<Role> roles = (List<Role>) this.getHibernateTemplate().find(hql, roleName);
		if (roles!=null&&roles.size()>0) {
			return roles.get(0);
		}else {
			return null;
		}
	}

	@Override
	public Role getRoleByNumber(String roleNumber) {
		String hql = "from Role as r where r.roleNumber=?";
		List<Role> roles = (List<Role>) this.getHibernateTemplate().find(hql, roleNumber);
		if (roles!=null&&roles.size()>0) {
			return roles.get(0);
		}else{
			return null;
		}
	}

}
