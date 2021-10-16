package com.yash.demoio.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("test.txt");
		String str="Hello Java";
		byte[] b= str.getBytes();
//		fo.write(104); ascii
		fo.write(b); //array of bytes
		fo.close();
		System.out.println("!Done");
	}
}
