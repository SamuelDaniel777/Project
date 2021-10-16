package com.demo.test1;

public class StringTest {
	public static void main(String[] args) {
		
		String str="Samuel Daniel";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("n"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("u"));
		System.out.println(str.replace("e", "m"));
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 7));
		
		String numbers="10,09,08,07,06,05,04,03,02,01";
		String[] values=numbers.split(",");
		for(String value:values) {
			System.out.println(value);
		}
		
		String url="www.google.com/resource/test/index/result.aspx";
		int lidx=url.lastIndexOf("/");
		String tempUrl=url.substring(lidx);
		System.out.println(tempUrl);
		lidx=tempUrl.lastIndexOf(".");
		tempUrl=tempUrl.substring(1,lidx);
		System.out.println(tempUrl);

		


	}
}
