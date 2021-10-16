package com.yash.demoio.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DemoInputStream {

	public static void main(String[] args) {
		try {
			File f=new File("test.txt");
			System.out.println(" name "+f.getName()+" path "+f.getPath()+" exist "+f.exists()+
					" size of partition "+f.getTotalSpace()+" hashcode compute "+f.hashCode()+" length in bytes"+f.length());
			
			FileInputStream fis=new FileInputStream(f);
//			System.out.println(" read function "+(char)fis.read());
			
//			System.out.println(fis.read());	
			
			int i;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
				
			}
			}
		catch (Exception e) {
			System.err.print(e);
		}
		

	}

}
