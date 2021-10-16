package com.yash.java8feautres.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();//java 8 date and time api
//		System.out.println(date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
//		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.printf("%d-%d-%d", dd, mm ,yy);//custom format
		
	}

}
