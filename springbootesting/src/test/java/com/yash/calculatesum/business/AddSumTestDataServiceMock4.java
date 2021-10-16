package com.yash.calculatesum.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;

import com.yash.calculatesum.businessinterface.DaoDataService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AddSum.class)
class AddSumTestDataServiceMock4 {
 
	@InjectMocks
	AddSum as;
	
	@Mock
	DaoDataService daoDataService;
	
	@Mock
	List<String> list;
	
	@Test
	void test_forMultipeValueUsingDaoDataService() {
		when(daoDataService.getData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, as.calculateSumUsingDataService());
	}
	
	
	@Test
	void test_for_emptyArry() {
		when(daoDataService.getData()).thenReturn(new int[] {});
		assertEquals(0, as.calculateSumUsingDataService());
		
	}
	
	@Test
	void test_for_singleValue() {
		when(daoDataService.getData()).thenReturn(new int[] {1});
		assertEquals(1, as.calculateSumUsingDataService());	
	
	}
	
	
	//METHOD CALLING TESTING
	@Test
	void methodVerification() {
		
		String str1= list.get(0);
		String str2= list.get(1);
//		String str3= list.get(2);
		
		verify(list).get(0);
		verify(list).get(1);// verification for 1 index
//		verify(list).get(3);
		verify(list,times(1)).get(1);
		verify(list,times(2)).get(anyInt()); //exact number of method invocation
		verify(list,atLeast(1)).get(anyInt()); //at least once time method is called
		verify(list,atLeastOnce()).get(anyInt());//atleast once the method is called
		verify(list,atMost(2)).get(anyInt());//atmost how many times the method is called	
		verify(list,never()).get(3); //never called for index 3
		
	}
	
	@Test
	public void methodParameterTesting() {
		list.add("Hello");
		
		ArgumentCaptor<String>ac=ArgumentCaptor.forClass(String.class);
	}

}
