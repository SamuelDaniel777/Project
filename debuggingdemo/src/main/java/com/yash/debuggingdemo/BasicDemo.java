package com.yash.debuggingdemo;

public class BasicDemo {

	public static void main(String[] args) {
		int[] arr= {1,2,6};
		printArray(arr);
		
	}

	static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
