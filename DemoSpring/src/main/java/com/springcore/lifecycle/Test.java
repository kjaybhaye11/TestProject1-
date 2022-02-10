package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
				
			/*	Samosa s1=(Samosa) ctx.getBean("s1");
				System.out.println(s1);
				
				//register shut down method
				((AbstractApplicationContext) ctx).registerShutdownHook();
				
				System.out.println("///////////////////////////////////////////////////");
				Cock c1=(Cock) ctx.getBean("c1");
				System.out.println(c1);*/
			
		Example example=(Example) ctx.getBean("example");
		System.out.println(example);
		
	}

}
 