package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDAO;

import com.cg.entities.Product;
@Service
public class ProductService {
	    @Autowired private ProductDAO dao;
	    
	    public void create(Product p) {
	            dao.add(p);
	    
	    }
	public List<Product> getall1() {
		List<Product> list = dao.getall();
        
        return list;
	}
	 public Product findByCode(String code)
	 {
		 return dao.findByCode(code);
	 }

}
