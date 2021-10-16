package com.java.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.calculator.Check;

class CheckTest {

	@Test
	void test() {
		Check ch=new Check();
		Assertions.assertEquals(ch.checkNumber("12345"), true);
	}
	@Test
	void test2() {
		Check ch=new Check();
		Assertions.assertEquals(ch.checkNumber("12112"), false);
	}

}
