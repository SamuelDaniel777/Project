package com.yash.calculatesum.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddSumTest {
	AddSum as=new AddSum();
	@Test
	void test_forMultipleValue() {
		
		int actualResult= as.calculateAddition(new int[] {1,3,4});
		int expectedResult=8;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_for_emptyArry() {
		
		int actualResult= as.calculateAddition(new int[] {});
		int expectedResult=0;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void test_for_singleValue() {
		
		int actualResult= as.calculateAddition(new int[] {1});
		int expectedResult=1;
		assertEquals(expectedResult, actualResult);
		
	}

}
