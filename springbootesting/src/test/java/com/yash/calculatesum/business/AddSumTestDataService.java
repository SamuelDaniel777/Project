package com.yash.calculatesum.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.yash.calculatesum.businessinterface.DaoDataService;

class DemoStub1 implements DaoDataService{

	@Override
	public int[] getData() {
		return new int[] {1,4,6};
	}
}

class DemoStub2 implements DaoDataService{

	@Override
	public int[] getData() {
		return new int[] {};
	}
	
}

class DemoStub3 implements DaoDataService{

	@Override
	public int[] getData() {
		return new int[] {1};
	}
	
}

class AddSumTestDataService {
	
	@Test
	void test_forMultipleValueUsingDaoDataService() {
		AddSum as=new AddSum();
		as.setData(new DemoStub1());
		int actualResult= as.calculateSumUsingDataService();
		int expectedResult=11;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void test_for_emptyArry() {
		AddSum as=new AddSum();
		as.setData(new DemoStub2());
		int actualResult= as.calculateSumUsingDataService();
		int expectedResult=0;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void test_for_singleValue() {
		AddSum as=new AddSum();
		as.setData(new DemoStub3());
		int actualResult= as.calculateSumUsingDataService();
		int expectedResult=1;
		assertEquals(expectedResult, actualResult);	
	}

}
