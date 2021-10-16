package com.yash.demoio.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputDemo {

	public static void main(String[] args) throws IOException {
		String message="Hello World";
		FileOutputStream fos=new FileOutputStream("test.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] b = message.getBytes();
		bos.write(b);
		System.out.println("hello");
	}

}
