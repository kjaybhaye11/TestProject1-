package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/ref");
		
		A temp=(A) ctx.getBean("aref");
		System.out.println(temp.getX());
		
		System.out.println(temp.getObj().getY());
		
		System.out.println(temp);
		
	}

}
