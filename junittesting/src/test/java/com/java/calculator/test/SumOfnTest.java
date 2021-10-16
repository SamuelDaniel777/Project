package com.java.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.calculator.SumOfn;

class SumOfnTest {

	@Test
	void test_SumOfn_GivenSingleDigit_Should_ReturnAddSumofNumbers() {
		SumOfn son = new SumOfn();
		Assertions.assertEquals(son.calculateSum(10), 33);
	}
	@Test
	void test_SumOfn_GivenSingleString_Should_ReturnZero() {
		SumOfn son = new SumOfn();
		Assertions.assertEquals(son.calculateSum(""), 0);
	}
	
	

}
