package com.springcore.lifecycle;

public class Samosa {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting property price ");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Method o f init");
	}
	
	public void destroy()
	{
		System.out.println("Method of destroy");
	}
}
