package com.yash.collectiondemo.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set accountNumbers= new HashSet<>();
		accountNumbers.add("123");
		accountNumbers.add("123");//duplicate
		accountNumbers.add("12345");
		accountNumbers.add("1234");
		accountNumbers.add(null);
		accountNumbers.remove("1234");//remove method
		
		Set<Integer> bankId=  new HashSet<>();
		bankId.add(101);
		bankId.add(102);
		bankId.add(103);
		bankId.add(104);
		
		Set accountNumbersNew= new HashSet<>();
		
	//	accountNumbersNew.addAll(accountNumbers); //add all method.
	//	accountNumbersNew.removeAll(accountNumbersNew); //remove all
		bankId.retainAll(accountNumbers);        //retain all
		accountNumbers.clear();   //clear
		accountNumbers.isEmpty();   //isempty
		accountNumbers.size();     //size
		Object[] o= accountNumbers.toArray();     //collection to object array
		System.out.println(accountNumbers+ ""+ bankId);   
		

	}

}
