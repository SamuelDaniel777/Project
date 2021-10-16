package com.yash.java8feautres.test;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {

	public static void main(String[] args) {
		ArrayList<Integer> arlst=new ArrayList<>();
		arlst.add(5);
		arlst.add(8);
		arlst.add(5);
		arlst.add(2);
		arlst.add(7);
		arlst.add(2);
		arlst.add(7);
		arlst.add(13);
		arlst.add(64);
		arlst.add(7);
		arlst.add(3);
		arlst.add(1);
		List<Integer> nlst=arlst.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(nlst);
		
	}

}
