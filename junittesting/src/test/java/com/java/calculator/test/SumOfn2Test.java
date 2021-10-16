package com.java.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.calculator.SumOfn2;

class SumOfn2Test {

	@Test
	void test() {
		SumOfn2 son2 = new SumOfn2();
		Assertions.assertEquals(son2.calculateDifference("2"),"-4");
		
	}
	@Test
	void test2() {
		SumOfn2 son2 = new SumOfn2();
		Assertions.assertEquals(son2.calculateDifference("0"),"Invalid Entry");
	}
	
}
