package com.yash.java8feautres.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountUsingStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> arl=new ArrayList<>();
		arl.add(10);
		arl.add(9);
		arl.add(8);
		arl.add(7);
		arl.add(6);
		arl.add(5);
		arl.add(4);
		arl.add(3);
		arl.add(2);
		arl.add(1);
		long nlist=arl.stream().count();
		System.out.println(nlist);
		List<Integer> sortedList=arl.stream().sorted((a1,a2)->(a1>a2)?-1:(a1<a2)?1:0).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
