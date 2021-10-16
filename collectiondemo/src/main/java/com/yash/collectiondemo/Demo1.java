package com.yash.collectiondemo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		//list extends collection arraylist implements list
		List Products=new ArrayList<>(); //arraylist using list
		Products.add("soap");
		Products.add("rice");
		Products.add("Atta");
		Products.remove(0); //remove method
		int a= Products.size();//size of
//		Products.clear();//clears whole list
		boolean b= Products.contains("rice");
		System.out.println(Products+" size is "+a+" contains rice" +b);
		
		Collection Products1=new ArrayList<>(); //arraylist using collection
		Products1.add("soap");
		Products1.add("rice");
		Products1.add("Atta");
		System.out.println(Products);
		
		List names=new ArrayList<>(); //list of names
		names.add("ram");
		names.add("rohan");
		names.add("sumit");
		System.out.println(names);
		
		
		//HashSet implements Set interface Set extends Collection
 		//unique values //uses hash table //hashing for storing 
		Set accountNumbers= new HashSet<>();
		accountNumbers.add("123");
		accountNumbers.add("123");//duplicate
		accountNumbers.add("12345");
		accountNumbers.add("1234");
		accountNumbers.add(null);
		System.out.println(accountNumbers);//output using sysout //sorted output
		
		//tree set implements Set //uses tree for storing value
		//unique values like hashset //sorted output
		Set empId=new TreeSet<>();
		empId.add("I5");
		empId.add("I2");
		empId.add("I3");
		System.out.println(empId);
		
		
		for (Object object : Products) { //using loop
			System.out.println(object);
		}
		
		
	}

}
