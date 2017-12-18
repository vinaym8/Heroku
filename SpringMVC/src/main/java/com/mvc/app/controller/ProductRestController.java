package com.mvc.app.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.app.entity.Products;

@RestController("/productService")
public class ProductRestController {
	
	@Autowired
	private SessionFactory sessionFactory;
	@RequestMapping(value="/product/{productCode}",method=RequestMethod.GET)
	public Products fetchProductById(@PathVariable("productCode") String productCode) {
		Session session = sessionFactory.openSession();
		Products products = (Products)session.get(Products.class,productCode);
		return products;
	}

}
