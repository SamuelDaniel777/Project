package com.yash.exhanling.assignment;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class Assignment2 {

	public static void main(String[] args) {
		Vector<String> st = new Vector<>();
		try {
			File f=new File("C:\\Users\\benny\\Desktop\\yash training\\test1.txt");
			if(f.exists()) {
				Scanner sc=new Scanner(f);
				while (sc.hasNextLine()) {
					st.add(sc.nextLine());
				}
				System.out.println(st);
			}
	
			
//			else {
//				System.out.println("file does not exist");
//			}
		} catch (Exception e) {
			System.err.println("File Not found Exception");
		}
	}

}
