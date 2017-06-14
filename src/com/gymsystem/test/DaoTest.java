package com.gymsystem.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.gymsystem.po.User;


public class DaoTest extends HibernateDaoSupport{

	private SessionFactory setSessionFactoryOverride;
	ApplicationContext applicationContext;
	
	
	public void setSessionFactoryOverride(SessionFactory setSessionFactoryOverride) {
		this.setSessionFactoryOverride = setSessionFactoryOverride;
		super.setSessionFactory(setSessionFactoryOverride);
		System.out.println("×¢Èë¸¸ÀàµÄ sessionFactory");
		setHibernateTemplate(createHibernateTemplate(setSessionFactoryOverride));
	}
	

	@Before
	public void config(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void addUser(){
		
//		
		SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
//		
//		System.out.println(sessionFactory+"=======");
		
//		User user  = new User("mike","123");
		
		this.setHibernateTemplate(createHibernateTemplate(sessionFactory));
		
		if (this.getHibernateTemplate()==null) {
			System.out.println("hibernteTemplate is null");
		}else {
			User user = new User(1,"mike", "123");
			User user2 = getHibernateTemplate().get(User.class, 1);
			System.out.println(user2.getPassword()+"========");
			getHibernateTemplate().update(user);
		}
		
		
		
		if (sessionFactory == null) {
			System.out.println("sessionFactory is null");
		}else {
			System.out.println("sessionFactory is not null");
		}
		
	}
	
}
