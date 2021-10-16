package com.yash.demoio.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f= new File("asd","asdf");
		FileWriter fr=new FileWriter(f);
		System.out.println(f.exists());
//		f.createNewFile(); //creates new file
		f.mkdir(); // creates new directory
	}

}
