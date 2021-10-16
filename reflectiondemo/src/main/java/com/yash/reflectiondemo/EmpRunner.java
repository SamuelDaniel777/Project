package com.yash.reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class EmpRunner {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("com.yash.reflectiondemo.Employee");
		THread
		System.out.println(c);
		System.out.println("Super class "+ c.getSuperclass());
		System.out.println("Derived class "+ c.getDeclaredClasses());
		System.out.println("Class"+c.getClass());	
		System.out.println("Count Modifiers "+c.getModifiers()+" Hash Code "+c.hashCode());
		System.out.println("Type of modifier "+Modifier.toString(c.getModifiers()));
		
		Class[] cls = c.getInterfaces();
		for (Class class1 : cls) {
			System.out.println(cls);
		}
		
		Field[] f1= c.getFields();
		for (Field field : f1) {
			System.out.println(field +"Field HashCode "+f1.hashCode());
		}
		
		Constructor[] con= c.getConstructors();
		for (Constructor constructor : con) {
			System.out.println(constructor +"Constructor Hashcode"+ constructor.hashCode());
		}
		
		Field[] f= c.getDeclaredFields();
		for (Field field : f) {
			System.out.println("Declared fields of current class"+ field +"Field HashCode "+f.hashCode());
		}
		
		
		
	}

}
