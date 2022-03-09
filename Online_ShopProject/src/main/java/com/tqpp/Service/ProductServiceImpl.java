package com.tqpp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqpp.Dao.ProductDao;
import com.tqpp.Model.Product;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pdao;
	
	@Override
	public boolean addProduct(Product s) {
		// TODO Auto-generated method stub
		  pdao.addProduct(s);
		  return true;
		 
	}

	@Override
	public boolean deleteProduct(Product s) {
		// TODO Auto-generated method stub
		return pdao.deleteProduct(s);
	}

	@Override
	public boolean updateProduct(Product s) {
		// TODO Auto-generated method stub
		pdao.updateProduct(s);
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pdao.getAllProducts();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return pdao.getProductById(id);
	}

	/*@Override
	public boolean manageStock(int id, int q) {
		// TODO Auto-generated method stub
		return false;
	}*/
	
	@Override
	public boolean manageStock(int id, int q) {
		
		pdao.manageStock(id, q);
		
		return true;
		
	}

	

	

}
