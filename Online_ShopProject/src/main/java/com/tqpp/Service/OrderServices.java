package com.tqpp.Service;

import java.util.List;

import com.tqpp.Model.Order;
import com.tqpp.Model.User;

public interface OrderServices {

	boolean addOrder(Order or);

	boolean deleteOrderById(int oid);

	boolean updateOrder(Order or);

	List<Order> getAllOrders();

	Order getOrderById(int oid);
	
	
	
	
}
