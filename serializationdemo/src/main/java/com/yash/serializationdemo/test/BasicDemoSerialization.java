package com.yash.serializationdemo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BasicDemoSerialization{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		String str=new String("Hello world");
//		FileOutputStream fos=new FileOutputStream("demo.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		System.out.println("successful");
//		oos.writeObject(str);
//		
//		
//		FileInputStream fis=new FileInputStream("demo.txt");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		System.out.println("read object");
//		String st=(String) ois.readObject();
//		System.out.println(st);
		
		Product p2=new Product(12, 123, "rice");
		Product p=new Product(1, 2, "Sugar");
		
		FileOutputStream fos=new FileOutputStream("demo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		oos.writeObject(p2);
		
		
		FileInputStream fis=new FileInputStream("demo.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Product pr=(Product) ois.readObject();
		Product pr2=(Product) ois.readObject();
		System.out.println(pr+""+pr2);
		
		
		
	}

}
