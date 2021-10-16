package com.yash.productcartapp.sync;

public class ProductList {
	int id;
	double price;
	String name;
	public ProductList(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProductList [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
	
}
