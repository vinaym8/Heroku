package com.mvc.app.entity;

import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class Orderdetails {
	
	@EmbeddedId
	private Key key;
	
	@Column(name="quantityOrdered")
	private int quantityordered;
	
	@Column(name="priceEach")
	private double priceeach;
	
	@Column(name="orderLineNumber")
	private int orderlinenumber;
	
	public Orderdetails() {
		// TODO Auto-generated constructor stub
	}

	public Orderdetails(Key key, int quantityordered, double priceeach, int orderlinenumber) {
		super();
		this.key = key;
		this.quantityordered = quantityordered;
		this.priceeach = priceeach;
		this.orderlinenumber = orderlinenumber;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public int getQuantityordered() {
		return quantityordered;
	}

	public void setQuantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}

	public double getPriceeach() {
		return priceeach;
	}

	public void setPriceeach(double priceeach) {
		this.priceeach = priceeach;
	}

	public int getOrderlinenumber() {
		return orderlinenumber;
	}

	public void setOrderlinenumber(int orderlinenumber) {
		this.orderlinenumber = orderlinenumber;
	}
	
	
}

