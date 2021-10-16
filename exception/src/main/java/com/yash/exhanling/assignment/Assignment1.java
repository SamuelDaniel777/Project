package com.yash.exhanling.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Assignment1 {
	public static void main(String[] args) {
		Vector<String> vr=new Vector<>();
		try {
		File f=new File("C:\\Users\\benny\\Desktop\\yash training\\test.txt");
		if (f.exists()) {
			Scanner sc=new Scanner(f);
			
			while (sc.hasNextLine()) {
				vr.add(sc.nextLine());
			}
			
			System.out.println(vr);
			
		} 
		}
		catch (FileNotFoundException e) {
			System.err.print("File does not exist"+e);
		}
		
	}
}
