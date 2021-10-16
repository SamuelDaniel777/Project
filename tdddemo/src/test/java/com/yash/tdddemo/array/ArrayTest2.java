package com.yash.tdddemo.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTest2 {
	
	Array2 at1=new Array2();
	@Test
	void test_ArrayCheck_GivenValues_Odd_Even_Positve_Negative() {
			int[] arr= {1,2,3,5,6,7,8,9,10,-1,5,7};
			String input=at1.checkNumber(arr);
			Assertions.assertEquals(input,"48111");
	}
	
}
