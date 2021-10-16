package com.yash.collectiondemo.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoApp {

	public static void main(String[] args) {
		
		
		Customer c1=new Customer("zohan", 12, 34);
		Customer c2=new Customer("sohan", 11, 53);
		Customer c3=new Customer("Rohan", 42, 35);
		Customer c4=new Customer("tohan", 55, 56);
		Customer c5=new Customer("Rohan", 42, 35);//duplicate
	
		
		
		ArrayList<Customer> data= new ArrayList<>();
		
		data.add(c1);
		data.add(c2);
		data.add(c3);
		data.add(c4);
		data.add(c5);
		
//		for (Customer customer : data) {
//			System.out.println("before the sort" +data);
//		}
		
		Comparator<Customer> cu=new Comparator<Customer>() {
			public int compare(Customer c1, Customer c2) {
				 return c1.getName().compareTo(c2.getName());	
			}
		};
		
		
		
//		System.out.println(se);
		
		
		
//		Collections.sort(data);
		Collections.sort(data,cu);
		System.out.println(data);
		
//		for(Object p:data) {
//			System.out.println("after sort"+p);
//		}
			
	}

}
