package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=null;
		try {
		   tx=session.beginTransaction();
	//	Student s1=new Student(2,"Sham",90,"cricket");
		   
		   Student s1=new Student();
		   
		   s1.setSname("Shanaya");
		   s1.setPercent(88);
		   
		   Address a1= new Address();
		   a1.setAddress1("B2m road");
		   a1.setCity("Pune");
		   a1.setLandmark("Raam nagar");
		   s1.setAddr(a1);
		   
	    session.save(s1);
	  //  s1.setSname("Shdhra");
	    
		tx.commit();
		}
		catch(Exception e)
		{
			tx.rollback();
		}
	}

}
