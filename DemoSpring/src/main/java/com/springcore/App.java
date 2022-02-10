 package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome");
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/springcore.xml");
		
		Student student1=(Student) ctx.getBean("student1");
		System.out.println(student1);
		
	}

}
 