 package Pract;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateTute {

public static void main(String args[]) {
	System.out.println("Hi project...");
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		
 	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
	
		
		//create question
		Ques q=new Ques();
		q.setQuesid(1212);
		q.setQues("What is your name");
		
		//Answer
		Ans a=new Ans();
		a.setAnsid(343);
		a.setAns("Kunal");
		a.setQues(q);
		
		Ans a1 = new Ans();
		a1.setAnsid(344);
		a1.setAns("Rahul");
		a1.setQues(q);
		
		//Add in list
		List<Ans> list=new ArrayList<Ans>();
		list.add(a);
		list.add(a1);
		q.setAns(list);
		
		
		session.save(q);
		session.save(a);
		session.save(a1);
		
		
		/*stu st=new stu();
		st.setId(12);
		st.setName("Rahul");
		st.setCity("Nashik");
		
		session.save(st);*/
		
	
		
		  tx.commit();
		  session.close();
	
	
	
}
}