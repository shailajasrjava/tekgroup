package com.dao;
import com.model.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import java.util.List;
@Repository("loginDAO")
public class LoginDAOImp1 implements LoginDAO 
{
	@Resource(name="sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession()
	{
		return sessionFactory.openSession();
	}
	public boolean checkLogin(String name, String password)
	{
		System.out.println("In Check login");
		Session session=sessionFactory.openSession();
		boolean userFound=false;
		String SQL_QUERY="from Users as o where o.name=? and o.password=?";
		Query query=session.createQuery(SQL_QUERY);
		query.setParameter(0, name);
		query.setParameter(1, password);
		List list=query.list();
		if((list!=null) && (list.size()>0))
		{
			userFound=true;
		}
		
		session.close();
		return userFound;
		
	}

}
