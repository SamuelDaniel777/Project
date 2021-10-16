package com.yash.tdddemo.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	
	StringCalculator sc;
	@BeforeEach
	void bemethod(){
		sc=new StringCalculator();
	}
	
	@Test
	void test_AddMethod_GivenValues_ShouldReturn_Addition() {
		int expected=3;
		int actual=sc.add(1,2);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void test_Multiply_GivenValues_ShouldReturn_Multiplication() {
		int expected=4;
		int actual=sc.multiply(2,2);
		Assertions.assertEquals(expected, actual);	
	}
	
	@Test
	void test_Square_GivenValues_ShoudReturn_Square() {
		int expected=4;
		int acutal=sc.square(2);
		Assertions.assertEquals(expected,acutal);
		}
	@Test
	void test_ExpectedNumberFormatException() {
		assertThrows(NumberFormatException.class, ()->{
			Integer.parseInt("one");});
	}
	
	@Test
	void test_Divide_GivenValues_ShouldReturn_divisor() {
		int expected=1;
		int actual=sc.divide(2,2);
		Assertions.assertEquals(actual, expected);
		
	}
	@Test
	void test_ArthematicException() {
		assertThrows(ArithmeticException.class,()->sc.divide(1, 0));
	}
	
	
}
	


