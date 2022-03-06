package com.tqpp.Dao;

import java.util.List;

import com.tqpp.Model.Order;
import com.tqpp.Model.User;

public interface OrderDao { 

	boolean addOrder(Order or);

	boolean deleteOrdeOrderrById(int oid);

	boolean updateOrder(Order or);

	List<Order> getAllOrders();

	Order getOrderById(int oid);
	
	
	
}
