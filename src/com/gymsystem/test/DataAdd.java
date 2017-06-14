package com.gymsystem.test;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gymsystem.po.Game;

/**
 * 
 * 该类主要是为了在数据库中添加原始数据
 * 
 * @author e.IT
 *
 */
public class DataAdd extends HibernateDaoSupport{

	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate;
	
	
	@Before
	public  void setUp(){
		String[] config = {"applicationContext.xml","applicationContext-beans.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		sessionFactory = context.getBean(SessionFactory.class);
		this.setHibernateTemplate(createHibernateTemplate(sessionFactory));
		hibernateTemplate = getHibernateTemplate();
	}
	
	@Test
	public void addGame(){
		Game game = new Game(null, "sdf", "sdf", "sdf", "sdf", "sdf", new Date(), "dslj", null);
		hibernateTemplate.save(game);
	}
	
	
	
	
	
	
	
}
