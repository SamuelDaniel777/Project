package com.yash.calculatesum.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.yash.calculatesum.businessinterface.DaoDataService;

class AddSumTestDataService2 {
	
	AddSum as=new AddSum();
	
	DaoDataService dds=mock(DaoDataService.class);
	
	@Test
	void test_forMultipleValueUsingDaoDataService() {
		when(dds.getData()).thenReturn(new int[] {5,5,1});
		as.setData(dds);
		int actualResult= as.calculateSumUsingDataService();
		int expectedResult=11;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void test_for_emptyArry() {
		when(dds.getData()).thenReturn(new int[] {});
		as.setData(dds);
		int actualResult= as.calculateSumUsingDataService();
		int expectedResult=0;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void test_for_singleValue() {
		when(dds.getData()).thenReturn(new int[] {1});
		as.setData(dds);
		int actualResult= as.calculateSumUsingDataService();
		int expectedResult=1;
		assertEquals(expectedResult, actualResult);	
	}

}
