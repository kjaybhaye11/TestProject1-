package com.Pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Pract.stu;

public class HQlPegination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		
 	Session s=sessionfactory.openSession();
		Transaction tx=s.beginTransaction();
		
		
		Query q=s.createQuery("from stu");
		
		//implement penetration using hibernate
		
		q.setFirstResult(0);
		
		q.setMaxResults(4);
		
		List<stu>list=q.list();
		for(stu st:list)
		{
			System.out.println(st.getId()+" "+st.getName()+" "+st.getCity());
		}
		
		
		
		tx.commit();
		s.close();
		
	}

}
