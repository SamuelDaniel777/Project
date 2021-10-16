package com.yash.collectiondemo.test;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {

	String name;
	int id;
	int productQuantity;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public Customer(String name, int id, int productQuantity) {
		super();
		this.name = name;
		this.id = id;
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", productQuantity=" + productQuantity + "]";
	}
	@Override
	public int compareTo(Customer o) {
		if (this.getId()>o.getId()) {
			return 1;
		} else {
			return -1;
		}
		
	}
	
}
	
	
	
	
	
	
	
	
	

