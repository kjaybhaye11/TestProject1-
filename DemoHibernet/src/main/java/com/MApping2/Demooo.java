package com.MApping2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demooo {
public static void main(String[] args) {
	System.out.println("hhhhhhhhhhhhhhhhhhhhh");
	Configuration cfg = new Configuration();
	  cfg.configure("hibernate.cfg.xml"); SessionFactory
	  sessionfactory=cfg.buildSessionFactory();
	  
	  Session session=sessionfactory.openSession(); Transaction
	  tx=session.beginTransaction(); // tx=session.beginTransaction();
	  
	  //create question
	  Question q1= new Question(); q1.setQuestionid(1212);
	  q1.setQuestion("What is youe name?");
	 
	  System.out.println("####"+q1);
	  //create   Answer
	  Answer answer= new Answer();
	  answer.setAnswerid(343); answer.setAnswer("Kunal"); answer.setQuestion(q1);
	  // answer.setAnswer(q1); q1.setAnswer(answer);
	  System.out.println("******************************************");
	  session.save(answer); session.save(q1);
	  
	  
	  tx.commit(); System.out.println("Done");
	 
	   session.close();
	
	
	
	
} 


}
