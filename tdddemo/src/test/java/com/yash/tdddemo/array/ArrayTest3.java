package com.yash.tdddemo.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest3 {

	Array3 a3=new Array3();
	
	@Test
	void test_Reverseit_GivenArray_Return_Reverse_Array() {
		int []inputArray={1,3,5,6,76,8,8};
		int [] output= a3.reverseIt(inputArray);
		int [] expected= {8,8,76,6,5,3,1};
		assertArrayEquals(output, expected);
		
	}

}
