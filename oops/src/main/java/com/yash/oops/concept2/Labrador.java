package com.yash.oops.concept2;

public class Labrador extends Dog {
	
	String name;
	String colour;
	Labrador(){}
	void speak() {
		System.out.println("Labrador");
	}
	public Labrador(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}
	
}
