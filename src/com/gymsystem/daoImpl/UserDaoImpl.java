package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.Query;

import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.gymsystem.dao.UserDao;
import com.gymsystem.po.Game;
import com.gymsystem.po.Role;
import com.gymsystem.po.User;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.UserVo;


@Component
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	private SessionFactory sessionFactory;
	
	
	@Override
	public List<User> queryUsers(User user) {
		//ƴ��hql;
		try {
			String hql = MyUtil.getHqlFromObject(user);
			Map<String,Object> queryConditions = MyUtil.objectToMap(user);
			org.hibernate.Query queryUser = this.getSession().createQuery(hql);
			for(Entry<String,Object>entry:queryConditions.entrySet()){
				if(!entry.getValue().equals("")){
					queryUser.setParameter(entry.getKey(), entry.getValue());
	            }
			}
			return queryUser.list();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	@Override
	public void addUser(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	
	@Override
	public User getUserByName(String username) {
		String hql = "from "+clazz.getSimpleName()+" as c where c.username=:username";
		List<User>list = getSession().createQuery(hql).setString("username", username).list();
		if (list.size()>0&&list!=null) {
			return list.get(0);
		}else{
			return null;
		}
	}
	
	
	@Override
	public User getUserByNumber(String userNumber) {
		System.out.println("userDaoImpl is "+userNumber);
		System.out.println(clazz.getSimpleName());
		String hql = "from "+clazz.getSimpleName()+" as c where c.userNumber=:userNumber";
		List<User>list = getSession().createQuery(hql).setString("userNumber", userNumber).list();
		System.out.println(list.size());
		if (list.size()>0&&list!=null) {
			System.out.println(list.get(0).toString());
			return list.get(0);
		}else{
			System.out.println("userDaoImpl user Ϊ��");
			return null;
		}
	}
}
