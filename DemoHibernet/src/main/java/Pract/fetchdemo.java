package Pract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchdemo {

	public static void main(String args[]) { 
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sessionfactory=cfg.buildSessionFactory();
	
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
	
	
	//stu s = (stu)session.load(stu.class, 11);
	
	stu s = (stu)session.get(stu.class, 110);
	
	
	
	System.out.print("student");
	
	
	 tx.commit();
	}
}
