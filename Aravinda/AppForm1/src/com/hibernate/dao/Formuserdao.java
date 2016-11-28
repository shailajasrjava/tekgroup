package com.hibernate.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernate.bean.Tekemployee;
public class Formuserdao {
public void addUserDetails(String id, String name, String address) {
       try {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();  
        Session session=factory.openSession();
        Tekemployee u=new Tekemployee();

        Transaction transaction = session.beginTransaction();

u.setId(id);
u.setName(name);
u.setAddress(address);
session.save(u);
        transaction.commit();
        System.out.println("\n\n Details Added \n");
    }
       catch(HibernateException e){
    	System.out.println(e.getMessage());
    	System.out.println("error");
    }
}
            
    	}

