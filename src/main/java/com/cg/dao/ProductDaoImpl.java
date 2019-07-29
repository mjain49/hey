package com.cg.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.cg.entities.Product;


public class ProductDaoImpl {

    List<Product> p = new LinkedList<Product>();
    
    
    @PostConstruct
    public void populateSample() {
    	p.add(new Product("101", "Dairy Milk", 50));
        p.add(new Product("102", "5-star", 50));
        p.add(new Product("103", "much", 50));
    }
    
    public void add(Product prod) {
        p.add(prod);
    }
    
    public Product findByCode(String code) {
        Product cn = null;
        Optional<Product> opt = p.stream()
                                .filter( c -> c.getProductId().equalsIgnoreCase(code))
                                .findFirst();
        if(opt.isPresent()) {
            cn = opt.get();
        }
        return cn;
    }

    public List<Product> getall() {
        
        return p;
    }

    
    }
