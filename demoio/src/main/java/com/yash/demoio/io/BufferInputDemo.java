package com.yash.demoio.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferInputDemo {

	public static void main(String[] args)  {
		
		try
		(FileInputStream fis= new FileInputStream("test.txt");
		BufferedInputStream bis=new BufferedInputStream(fis))
		{
		Scanner sc=new Scanner(bis);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
