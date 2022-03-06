package com.tqpp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tqpp.Dao.OrderDao;
import com.tqpp.Model.Order;


@Service
public class OrderServicesImpl implements OrderServices {

	@Autowired
	private OrderDao orderdao;
	
	@Override
	public boolean addOrder(Order or) {
		// TODO Auto-generated method stub
		return orderdao.addOrder(or);
	}

	@Override
	public boolean deleteOrderById(int oid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(Order or) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(int oid) {
		// TODO Auto-generated method stub
		return null;
	}

}
