package com.yash.oops.inputreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.print("Enter Number ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		System.out.println(i);
		
	}

}
