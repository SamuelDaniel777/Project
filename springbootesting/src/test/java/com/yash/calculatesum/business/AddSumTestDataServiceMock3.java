package com.yash.calculatesum.business;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;

import java.util.List;

import org.junit.jupiter.api.Test;

class AddSumTestDataServiceMock3 {
	
	List list=mock(List.class);
	
	@Test
	void returnSingleValue() {
		when(list.size()).thenReturn(5);
		assertEquals(5, list.size());
	}
	
	@Test
	void returnMultipleValues() {
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}
	
	@Test
	void returnUsingArguments() {
		when(list.get(0)).thenReturn("hello");
		assertEquals("hello", list.get(0));
		assertEquals(null, list.get(1));
	}
	
	@Test
	void returnUisngAnyIntegerArgument() {
		when(list.get(anyInt())).thenReturn("hellojava");
		assertEquals("hellojava", list.get(0));
		assertEquals("hellojava", list.get(1));
		
	}
	
}
