package com.tqpp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class OrderDetails {

	@Id
	@GeneratedValue
	private int transactionId;

	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;

	public OrderDetails(Order order, Product product, Integer quantity) {
		super();
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;

	private Integer quantity;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public OrderDetails(int transactionId, Order order, Integer quantity) {
		super();
		this.transactionId = transactionId;
		this.order = order;
		this.quantity = quantity;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
