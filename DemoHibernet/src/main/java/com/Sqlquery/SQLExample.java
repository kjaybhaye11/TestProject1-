package com.Sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import Pract.stu;

public class SQLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		
 	Session s=sessionfactory.openSession();
		Transaction tx=s.beginTransaction();
		
		//SQL query
		String q="select *from stu";
		
		NativeQuery nq=s.createSQLQuery(q);
		
		List<Object[]> list=nq.list();
		for(Object[]  stud:list)
		{
			
			//System.out.println(Arrays.deepToString(stud));
			System.out.println(stud[1]+": "+stud[2]);
		}
		
		tx.commit();
		s.close();
		
	}

}
