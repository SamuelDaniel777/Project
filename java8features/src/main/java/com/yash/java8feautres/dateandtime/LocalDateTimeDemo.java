package com.yash.java8feautres.dateandtime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		int yy=ldt.getYear();
		int mm=ldt.getMonthValue();
		int dd=ldt.getDayOfYear();
		int ddd=ldt.getDayOfMonth();
		System.out.printf("%d %d %d %d", yy,mm,dd,ddd);
		
	}

}
