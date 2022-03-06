package com.tqpp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tqpp.Model.Order;
import com.tqpp.Model.OrderDetails;
import com.tqpp.Model.User;

@Transactional
@Repository
public class OrderDaoImpl  implements OrderDao{

	@Autowired
	private SessionFactory sessionfactory;
	 
	@Override
	public boolean addOrder(Order or) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(or);
		List<OrderDetails> list= or.getOrderdetails();
		for(OrderDetails o:list)
		{
			sessionfactory.getCurrentSession().save(o);
		}
			
		return true;
	}

	@Override
	public boolean deleteOrdeOrderrById(int oid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(Order or) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	@Override
	public Order getOrderById(int oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
