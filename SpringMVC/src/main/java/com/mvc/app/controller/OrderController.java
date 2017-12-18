package com.mvc.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.app.entity.Key;
import com.mvc.app.entity.Orderdetails;
import com.mvc.app.entity.Products;



@Controller
public class OrderController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/allOrders")
	public ModelAndView allOrders(HttpServletRequest request) {
		
		Session session = sessionFactory.openSession();
		Products product = new Products();
		product.setProductCode(request.getParameter("productCode"));
		Orderdetails orderdetails = new Orderdetails();
		Key keys = new Key();
		keys.setNumber(Integer.parseInt(request.getParameter("orderNumber")));
		keys.setProductcode(request.getParameter("productCode"));
		
		Query query = session.createQuery("select order from Orderdetails order where order.key.number = ? and order.key.productcode = ?");
		query.setParameter(0, keys.getNumber());
		query.setParameter(1, keys.getProductcode());
		
		Query query2 = session.createQuery("select product from Products product where product.productCode = ?");
		query2.setParameter(0, product.getProductCode());
		java.util.List<Orderdetails> orders = query.list();
		List<Products> products = query2.list();
		
		ModelAndView modelAndView = new ModelAndView("orderView");
		
			modelAndView.addObject("orderdetails",orders);
			modelAndView.addObject("products",products);
		
		return modelAndView;
		
		
		
		
	}

}
