package com.yash.java8feautres.dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		
		System.out.print("Please Enter your Birthday Year ");
		Scanner sc1=new Scanner(System.in);
		int year=sc1.nextInt();
		System.out.print("Please Enter month in which you were born ");
		Scanner sc2=new Scanner(System.in);
		int month=sc2.nextInt();
		System.out.print("Please Enter day in which you were born ");
		Scanner sc3=new Scanner(System.in);
		int day=sc3.nextInt();
		
		LocalDate birthday=LocalDate.of(year, month, day);
		LocalDate today=LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Your age is %d month %d day "
				+ "%d ", p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate kickOffDay=LocalDate.of(year+60, month, day);		
		Period pr=Period.between(today, kickOffDay);
		int daysLeft=pr.getYears()*365+pr.getMonths()*30+pr.getDays();
		System.out.println("You will be kick out in "+daysLeft+"days");
		
	}

}
