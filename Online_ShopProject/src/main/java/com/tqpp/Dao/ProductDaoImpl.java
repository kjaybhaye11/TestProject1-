package com.tqpp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tqpp.Model.Product;


@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addProduct(Product s) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(s);
		return true;
	}

	@Override
	public boolean deleteProduct(Product s) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().delete(s);
		return true;
	}

	@Override
	public boolean updateProduct(Product s) {
		// TODO Auto-generated method stub
		System.out.println("@@@@"+s);
		sessionFactory.getCurrentSession().saveOrUpdate(s);
		
		
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		Query<Product> q=sessionFactory.getCurrentSession().createQuery("from Product");
		List<Product> productlist=q.list();
		return productlist;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

	/*@Override
	public boolean manageStock(int id, int q) {
		// TODO Auto-generated method stub
		return false;
	}*/

	@Override
	public boolean manageStock(int id, int q) {
		Product p=sessionFactory.getCurrentSession().get(Product.class, id);
		p.setStockinhand(p.getStockinhand()-q);
		sessionFactory.getCurrentSession().saveOrUpdate(p);
	
		return true;
	}

}
