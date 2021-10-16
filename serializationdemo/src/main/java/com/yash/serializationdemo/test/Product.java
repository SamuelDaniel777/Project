package com.yash.serializationdemo.test;

import java.io.Serializable;

public class Product implements Serializable{
	int a;
	int b;
	String name;
	public Product(int a, int b, String name) {
		super();
		this.a = a;
		this.b = b;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [a=" + a + ", b=" + b + ", name=" + name + "]";
	}
	
}
