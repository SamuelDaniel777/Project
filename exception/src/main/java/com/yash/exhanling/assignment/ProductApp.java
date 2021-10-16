package com.yash.exhanling.assignment;

public class ProductApp {
	private int id;
	private String name;
	private double price;
	static {
		System.out.println("!Done");
		
		
	}
	public ProductApp(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductApp [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
