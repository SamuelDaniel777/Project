package com.java.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.calculator.Calculator;

class CalculatorTest {
	@Test
	void test_Calculator_givenZero_shouldReturnzero() {
		Calculator ca = new Calculator();
		Assertions.assertEquals(ca.calculate(""),0 );
	}
	@Test
	void test_Calculator_givenSingleDigit_shouldReturnSingleDigit(){
		Calculator ca = new Calculator();
		Assertions.assertEquals(ca.calculate("2"), 2);
	}
	@Test
	void test_Calculator_givenDoubleDigit_shouldReturnAdditionDoubleDigit(){
		Calculator ca = new Calculator();
		Assertions.assertEquals(ca.calculate(1,1), 2);
	}
	
	

}
