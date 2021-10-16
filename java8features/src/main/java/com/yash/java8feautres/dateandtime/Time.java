package com.yash.java8feautres.dateandtime;

import java.time.LocalTime;

public class Time {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int hh=time.getHour();
		int mm=time.getMinute();
		int ss=time.getSecond();
		int ns=time.getNano();
		System.out.printf("%d:%d:%d:%d", hh,mm,ss,ns);
		
	}

}
