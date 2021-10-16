package com.yash.tdddemo.array;

import java.util.Iterator;

public class Array3 {

	public int[] reverseIt(int[] inputArray)
	{
		int j=inputArray.length;
		int[] reverseArray=new int[j];
		for(int i=0;i<inputArray.length;i++) {
			reverseArray[j-1] =inputArray[i];
			j=j-1;
		}
		
		return reverseArray;
	}
	
}
