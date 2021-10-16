package com.yash.java8feautres.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomSortingStream {

	public static void main(String[] args) {
		ArrayList<Integer> arl=new ArrayList<>();
		arl.add(1);
		arl.add(9);
		arl.add(5);
		arl.add(7);
		arl.add(8);
		arl.add(9);
		arl.add(1);
		arl.add(3);
		arl.add(25);
		arl.add(4);
		long nlist=arl.stream().count();
		System.out.println(nlist);
		List<Integer> sortedList=arl.stream().sorted((a1,a2)->(a1>a2)?-1:(a1<a2)?1:0).collect(Collectors.toList());
		System.out.println(sortedList);
		//toArray
		Integer[] i= arl.stream().toArray(Integer[]::new);
		//stream of
		Stream.of(i).forEach(System.out::println);
	}

}
