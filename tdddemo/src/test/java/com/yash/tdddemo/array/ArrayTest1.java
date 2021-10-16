package com.yash.tdddemo.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTest1 {

	@Test
	void test_ArrayTest1_GivenValues_Shoud_Return_ValueIfExist() {
		Array1 at=new Array1();
		int expected=2;
		int actual=at.SearchArray(1);
		assertEquals(expected, actual);
		System.out.println(at.SearchArray(1));
		
	}
	

}
