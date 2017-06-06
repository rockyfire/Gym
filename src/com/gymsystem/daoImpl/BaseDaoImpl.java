package com.gymsystem.daoImpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gymsystem.dao.BaseDao;

public class BaseDaoImpl <T> extends HibernateDaoSupport implements BaseDao<T> {

	private SessionFactory sessionFactory;
	protected Class clazz;
	
	public BaseDaoImpl() {
		System.out.println("this������ǵ�ǰ���ù��췽���Ķ���" + this);
		System.out.println("��ȡ��ǰthis����ĸ�����Ϣ" + this.getClass().getSuperclass());
		System.out.println("��ȡ��ǰthis����ĸ�����Ϣ(����������Ϣ)" + this.getClass().getGenericSuperclass());
		//�õ����͵Ĳ�������
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
	}
	
	
	public Session getSession(){
		return this.getHibernateTemplate().getSessionFactory().getCurrentSession();
	}
	
	@Override
	public void save(T object) {
		this.getHibernateTemplate().save(object);
	}

	@Override
	public void update(T object) {
		this.getHibernateTemplate().merge(object);
	}

	@Override
	public void delete(Integer id) {
		System.out.println(clazz.getSimpleName());
		
		T entity = get(id);
		this.getHibernateTemplate().delete(entity);
		
//		String hql = "delete "+clazz.getSimpleName()+" as c where c.id=:id";
//		getSession().createQuery(hql).setInteger("id", id).executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Integer id) {
		return (T) this.getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List<T> query() {
		String hql = "from "+clazz.getSimpleName();
		return getSession().createQuery(hql).list();
	}
	
}
