package com.tqpp.Dao;

import java.util.List;

import com.tqpp.Model.Product;



public interface ProductDao {

	boolean addProduct(Product s);

	boolean deleteProduct(Product s);

	boolean updateProduct(Product s);

	List<Product> getAllProducts();

	Product getProductById(int id);
	
	
}
