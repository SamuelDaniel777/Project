package com.yash.tdddemo.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest4 {
	Array4 ar4=new Array4();
	@Test
	void test() {
		
		assertEquals(ar4.reverseString("Hello"), "olleH");
		
	}

}
