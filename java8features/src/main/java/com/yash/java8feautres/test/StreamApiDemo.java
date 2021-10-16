package com.yash.java8feautres.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(23);
		ar.add(45);
		ar.add(1);
		ar.add(12);
		ar.add(56);
		ar.add(73);
		ar.add(13);
		ar.add(67);
		List<Integer> arn=ar.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(arn);
		
		
	}

}
