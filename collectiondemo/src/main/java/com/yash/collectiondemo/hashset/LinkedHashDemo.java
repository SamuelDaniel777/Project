package com.yash.collectiondemo.hashset;

import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet<>();
		lhs.add("cat");
		lhs.add("Horse");
		lhs.add("Dog");
		lhs.add("pig");
		lhs.add("pig");
		System.out.println(lhs);
	}

}
