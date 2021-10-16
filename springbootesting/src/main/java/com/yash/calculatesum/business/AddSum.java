package com.yash.calculatesum.business;

import java.util.ArrayList;
import java.util.List;

import com.yash.calculatesum.businessinterface.DaoDataService;

public class AddSum {
	
	private DaoDataService data;
	public void setData(DaoDataService data) {
		this.data = data;
	}

	public int calculateAddition(int[] a) {
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int a[]=data.getData();
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
	}
	
	
	 
	
}
