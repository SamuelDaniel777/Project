package com.yash.collectiondemo.assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.yash.collectiondemo.exception.NullValueException;

public class Assignment2 {

	public static void main(String[] args) {
		
		HashSet<Product> pr=new HashSet<>();
		pr.add(new Product(1, "smartphone", 10000.00));
		pr.add(new Product(2, "musicsystem", 5000.50));
		pr.add(new Product(3, "smartwatch", 20000.42));
		pr.add(new Product(4, "Air Conditioner", 25000.34));
		pr.add(new Product(5, "Tablet", 9000.25));
		pr.add(null);
		System.out.println(pr.isEmpty());
		
	}

}
