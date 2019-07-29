package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.service.ProductService;

@RequestMapping("/")
@RestController
public class ProductController {

		
		@Autowired private ProductService service;
		
		
		/* Request Handling Method
		 * Syntax
		 * 1. public ModelAndView methodName(){}
		 * 2. public String methodName(Model model){}
		 * 3. public String methodName(Map<String,Object> model){}
		 * 4. public String methodName(){}
		
		*/
	
	 @GetMapping(value="/list")
	    public List<Product> get(){
	        List<Product> l=service.getall1();
	        return l;
	    }
	 @PostMapping(value="/new",consumes= {"application/json"})
	    public String save(@RequestBody Product prod) {
	        service.create(prod);
	        return "Product added!";
	    }

}
