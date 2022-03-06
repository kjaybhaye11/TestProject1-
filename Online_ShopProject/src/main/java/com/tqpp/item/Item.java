package com.tqpp.item;

import java.io.Serializable;

public class Item implements Serializable {

	
  private static final long serialVersionUID=1L;
	private int itemid;
	private String itemname;
	private int itemprice;
	private int quantity;
	
	public Item(int i, String string, int j, String string2, int k) 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemid, String itemname, int itemprice, int quantity) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.quantity = quantity;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemprice() {
		return itemprice;
	}

	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + ", quantity="
				+ quantity + "]";
	}
	
	
	
	
}
