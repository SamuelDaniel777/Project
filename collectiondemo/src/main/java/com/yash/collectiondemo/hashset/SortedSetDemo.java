package com.yash.collectiondemo.hashset;

import java.util.SortedSet;
import java.util.TreeSet;
/**
 * 
 * @author benny
 * Sorted Set Demo
 */

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet ss= new TreeSet<>(); 
		ss.add(103);
		ss.add(104);
		ss.add(105);
		ss.add(104);
		ss.add(104);
		ss.add(108);
		ss.add(106);
		ss.add(107);
		
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(106));
		System.out.println(ss.tailSet(105));
		System.out.println(ss.subSet(104, 107));
		
		
		
		System.out.println(ss);
		
		System.out.println(new Integer(10).compareTo(100));
		
	}

}
