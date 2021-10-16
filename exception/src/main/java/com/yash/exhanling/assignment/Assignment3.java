package com.yash.exhanling.assignment;

import java.util.Scanner;

class Input{
	
	
	void arrayInput(int[] a)throws ArrayIndexOutOfBoundsException, NullPointerException{
		int[] arr=new int[a.length];
		for(int i=0;i<7;i++) {
			arr[i]=a[i];
		}
		
	}
	
}

public class Assignment3 {
		public static void main(String[] args) {
			Input in=new Input();
			int arr[]= {1,2,5,54,5};
			try {
				in.arrayInput(arr);
			}
			catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.out.println(e);
			}
		}
}
