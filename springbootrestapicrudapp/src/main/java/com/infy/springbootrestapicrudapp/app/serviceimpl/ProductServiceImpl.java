package com.infy.springbootrestapicrudapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.repository.ProductRepository;
import com.infy.springbootrestapicrudapp.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI{

	@Autowired
	ProductRepository pr;
	
	@Override
	public void saveProduct(Product p) {
		 pr.save(p);
	}

	@Override
	public void deleteProduct(int productId) {
		pr.deleteById(productId);
		
	}

	@Override
	public Iterable<Product> getAllProductData() {
		
		return pr.findAll();
	}

	@Override
	public void updateProductData(Product p1) {
		pr.save(p1);
	}
}
