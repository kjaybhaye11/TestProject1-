package com.HQL;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

import Pract.stu;

public class HqlExample {
	public static void main (String args[]) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		
 	Session s=sessionfactory.openSession();
		Transaction tx=s.beginTransaction();
		
	//String query="from stu";
	 //String query="from stu where city='Pune'";
		//String query="from stu where city=:x";    //3
	/*	String query="from stu as s where s.city=:x and s.name=:y" ;   //4
		
		
		Query q=s.createQuery(query);
		q.setParameter("x", "Pune");               //3    //4
		q.setParameter("y", "Kunal");                       //4
		
		
		List<stu> list=q.list();
		
		for(stu  stud:list)
		{
			
		  System.out.println(stud.getCity()+" "+stud.getName());
		}
		*/	
		//String query="from stu";
	
		
		
//Delete Query		
	/*	Query q1=s.createQuery("delete from stu s where s.city=:c ");
		
		q1.setParameter("c", "Thane");  
		
		int r =q1.executeUpdate();
		System.out.println("Delete");
		System.out.println(r);
		*/
//update
		Query q2=s.createQuery("update stu set city=:x where name=:y");
		q2.setParameter("x", "Delhi");
		q2.setParameter("y", "Pooja");
		
		int r =q2.executeUpdate();
		System.out.println(r);
		
		
		
			
		tx.commit();
		s.close();
		
	}

}
