package com.mvc.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Key implements Serializable{
	

	@Column(name="orderNumber", nullable = false)
	private int number;
	
	@Column(name="productCode", nullable = false)
	private String productcode;

	public Key() {
		
	}

	public Key(int number, String productcode) {
		
		this.number = number;
		this.productcode = productcode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	
	
	

}
