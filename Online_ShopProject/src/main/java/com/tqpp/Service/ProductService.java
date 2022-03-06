package com.tqpp.Service;

import java.util.List;

import com.tqpp.Model.Product;

public interface ProductService {

	
	boolean addProduct(Product s);

	boolean deleteProduct(Product s);

	boolean updateProduct(Product s);

	List<Product> getAllProducts();

	Product getProductById(int id);

	
	
}
