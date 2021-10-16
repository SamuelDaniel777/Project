package com.yash.arraydemo.assignmetn1;

public class Array1 {

	public int SearchArray(int i) {
		int [] arr= {1,2,4,5,1,5};
		int count=0;
		
		for(int j=0;j<arr.length;j++)
		{
			if (arr[j]==i) {
				count=count+1;
			}		
		}
		return count;
		
		
	}
	
	

}
