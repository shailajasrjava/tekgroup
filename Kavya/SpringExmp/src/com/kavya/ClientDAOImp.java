package com.kavya;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDAOImp  {

	public void add(String Id, String firstname, String lastname, String email) {
		// TODO Auto-generated method stub
		try {
			Session ses = getSession();
			Client c = new Client();
			
			Transaction tx = ses.beginTransaction();
			c.setId(Id);
			c.setFirstname(firstname);
			c.setLastname(lastname);
			c.setEmail(email);
			ses.save(c);
			tx.commit();
			System.out.println("\n\n Details addes \n");
}
		catch(HibernateException e) {
			e.printStackTrace();
		}
}
	private Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		return ses;
	}
	public List<Client> getClients() {
		try {
			Session ses = getSession();
			Query q = ses.createQuery("from Client");
			List<Client> cl = q.list();
			return cl;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
	}