package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome");
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
	
		Emp emp1=(Emp) ctx.getBean("emp1");
		//System.out.println(emp1);
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCoureses());
		
	
	}

}
