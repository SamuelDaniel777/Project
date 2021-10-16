package com.yash.java8feautres.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> als=new ArrayList<>();
		
		als.add(new Student(1, "Ramesh", 100, 70.21));
		als.add(new Student(2, "Suresh", 101, 85.66));
		als.add(new Student(3, "Neeraj", 102, 55.8));
		als.add(new Student(4, "Somesh", 103, 45.93));
		als.add(new Student(5, "Gopal", 104, 35.12));
		als.add(new Student(6, "Rajesh", 105, 20.11));
		als.add(new Student(7, "Ramlal", 106, 25.67));
		
		//default sorting of student name
		List<String> studenName=als.stream()
				.map(s->s.getName())
				.sorted()
				.collect(Collectors.toList());
		studenName.forEach(System.out::println);
		
		//custom sorting in desending order
		List<String> studenNameRev=als.stream()
				.map(s->s.getName())
				.sorted((a1,a2)->-a1.compareTo(a2))
				.collect(Collectors.toList());
		studenNameRev.forEach(System.out::println);
		
		//student marks less than 35 add 5 more marks
		List<Double> failedStudents=als.stream()
				.filter(s->s.getMarks()<35)
				.map(s->s.getMarks()+5)
				.collect(Collectors.toList());
		failedStudents.stream().forEach(System.out::println);	
	
		//student with minimum marks
		Double d=als.stream()
				.map(s->s.getMarks())
				.min((s1,s2)->s1.compareTo(s2))
				.get();
		System.out.println("Student With min marks"+d);
		
		//student with max marks
		Double ds=als.stream()
				.map(s->s.getMarks())
				.max((s1,s2)->s1.compareTo(s2))
				.get();
		System.out.println("Student With max marks"+ds);
		
		String name="Ramesh";
		Function<Student, Boolean> f=s->s.getName().equals(name);
		Predicate<Student> p=f::apply;
		System.out.println(p);
		List<Student> s1= als.stream().filter(p).collect(Collectors.toList());
//		System.out.println(s1);
		
		
		
	}
	 	
	
	

}
