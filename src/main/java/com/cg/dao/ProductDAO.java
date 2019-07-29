package com.cg.dao;

import java.util.List;

import com.cg.entities.Product;

public interface ProductDAO {
	 void add(Product p);
	   
	    List<Product> getall();
	    public Product findByCode(String code);
}