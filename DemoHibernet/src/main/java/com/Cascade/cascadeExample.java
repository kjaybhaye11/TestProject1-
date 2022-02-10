package com.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pract.Ans;
import Pract.Ques;

public class cascadeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		
 	Session s=sessionfactory.openSession();
		Transaction tx=s.beginTransaction();
		
		
		Ques q= new Ques();
		q.setQuesid(11);
		q.setQues("What is your name");
		
		Ans a1=new Ans(21,"Kunal");
		Ans a2=new Ans(22,"Sham");
		Ans a3=new Ans(23,"Ram");
		
		List<Ans>list =new ArrayList<Ans>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q.setAns(list);
		s.save(q);
		
		////s.save(a1);
		//s.save(a2);
		//s.save(a3);
		
		
		tx.commit();
		s.close();
	}

}
