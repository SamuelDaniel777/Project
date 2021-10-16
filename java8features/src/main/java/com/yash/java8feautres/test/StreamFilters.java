package com.yash.java8feautres.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilters {

	public static void main(String[] args) {
		List<Product> arp=new ArrayList<>();
		arp.add(new Product(12,"Lcd",13000.01));
		arp.add(new Product(13,"dvd",5000.0));
		arp.add(new Product(16,"Music Player",30000.00));
		System.out.println(arp.get(1));
		List<Double> arpn=arp.stream()
				.filter(p->p.price>=10000)
				.map(p->p.price).collect(Collectors.toList());
		
//		int id=12;
//		Function<Integer, Boolean>f=;
//		Predicate<Product>
//		List<Product> plist=arp.stream().equals(p->p.get);
//		System.out.println(arpn1);	
//		arpn.stream().forEach(System.out::println);
		
	}

}
