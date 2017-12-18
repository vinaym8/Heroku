package com.mvc.app.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.app.entity.Orderdetails;

import antlr.collections.List;

@Controller
public class OrderdetailsController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/allOrderDetails")
	public ModelAndView allOrders() {
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Orderdetails");
		
		java.util.List<Orderdetails>orderdetails = query.list();
		
		ModelAndView modelAndView = new ModelAndView("orderdetailsView");
		
		modelAndView.addObject("orderdetails", orderdetails);
		
		return modelAndView;
		
		
	}

}
