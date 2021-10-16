package com.yash.java8feautres.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import javax.naming.ldap.PagedResultsControl;

public class LocalDayTimeDemo1 {

	public static void main(String[] args) {
//		LocalDateTime ldt=LocalDateTime.of(yy,mm,dd);
		LocalDate ldt=LocalDate.of(1995,9,14);
		System.out.println(ldt.plusMonths(6));
		LocalDate ldtn=LocalDate.now();
		Period p=Period.between(ldt, ldtn);
		System.out.printf("Your age is Years %d, Months %d, Day "
				+ "%d",p.getYears(),p.getMonths(),p.getDays());
		
	}

}
