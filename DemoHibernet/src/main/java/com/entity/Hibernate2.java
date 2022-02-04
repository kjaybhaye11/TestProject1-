package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.mapping.Emp;
import com.entity.mapping.Person;
import com.entity.mapping.Vehicle;

public class Hibernate2 {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		
		 //  Vehicle v1=new Vehicle(3900,"Bajaj");
		   //Person p1=new Person(2,"Amita",984005345,v1);
		   
		   //v1.setPerson(p1);
		  // session.save(v1);
		  // session.save(p1);
		
	
		   
		   
		   tx.commit();
		   
		
		
		
	}
}
