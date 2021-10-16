package com.yash.enumdemo.example;




public class EnumTest {
	public enum Season{Summer,rainy,winter}
	public static void main(String[] args) {
		
		for(Season s: Season.values()) {
			System.out.println(s);
		}

	}

}
