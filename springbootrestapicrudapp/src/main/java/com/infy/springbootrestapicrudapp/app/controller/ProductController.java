package com.infy.springbootrestapicrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.servicei.ProductServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping(value="/api")
public class ProductController {

	@Autowired
	ProductServiceI psi;
	
	//POST API
	
	@PostMapping(value="/product")
	public Product saveProduct(@RequestBody Product p)
	{
		System.out.println(p.getProductName());
		System.out.println(p.getProductId());
		System.out.println(p.getProductPrices());
		psi.saveProduct(p);
		return p;
	}
	
	//DELETE API
	
	@RequestMapping(value="/deletebyid/{productId}", method=RequestMethod.DELETE)
	public String deleteProduct(@PathVariable int productId)
	{
		psi.deleteProduct(productId);
		return "deleted";
	}
	
	//GET API
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public Iterable<Product> getAllProductData()
	{
		return psi.getAllProductData();
	}
	
	//PUT API
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public String updateProductData(@RequestBody Product p1)
	{
		psi.updateProductData(p1);
		return "updated";
	}
}
