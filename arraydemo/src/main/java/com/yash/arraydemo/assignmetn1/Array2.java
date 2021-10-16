package com.yash.arraydemo.assignmetn1;

import java.util.Iterator;

public class Array2 {

	public String checkNumber(int[] arr) {
		Integer countOdd=0;
		Integer countEven=0;
		Integer countPositive=0;
		Integer countNegetive=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				countEven+=1;
			}
			else {
				countOdd+=1;
			}
		if (arr[i]>0) {
			countPositive+=1;
		}
		else {
			countNegetive+=1;
		}
		}
		String s1=	countEven.toString();
		String s2= countOdd.toString();
		String s3= countPositive.toString();
		String s4= countNegetive.toString();
		return s1+s2+s3+s4;
	 
	}

}
