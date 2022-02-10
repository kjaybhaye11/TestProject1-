package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cock implements InitializingBean, DisposableBean {

	private double price;                       //InitializingBean, DisposableBean

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cock() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cock [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {        //only using init functionality
		// TODO Auto-generated method stub
		System.out.println("Drink Cock: init");
	}

	public void destroy() throws Exception {                     //DisposableBean  destroy  
		// TODO Auto-generated method stub
		System.out.println("Dont drink cock:destroy");
	}
	
}
