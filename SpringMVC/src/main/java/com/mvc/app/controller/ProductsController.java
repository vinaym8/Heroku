package com.mvc.app.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.app.entity.Products;

import antlr.collections.List;

@Controller
public class ProductsController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/allProducts")
	public ModelAndView allProducts() {
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Products");
		
		java.util.List<Products>products = query.list();
		
		ModelAndView modelAndView = new ModelAndView("productsView");
		
		modelAndView.addObject("products", products);
		
		return modelAndView;
		
		
	}

}

