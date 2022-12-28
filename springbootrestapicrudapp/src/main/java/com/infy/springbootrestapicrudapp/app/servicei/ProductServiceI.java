package com.infy.springbootrestapicrudapp.app.servicei;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductServiceI {

	public void saveProduct(Product p);

	public void deleteProduct(int productId);

	public Iterable<Product> getAllProductData();

	public void updateProductData(Product p1);

	


	

}