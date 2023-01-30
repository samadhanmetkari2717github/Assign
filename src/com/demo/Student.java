package com.demo;

public class Student {
	
	static Student st = new Student();  // create a static object
	
	 private  Student() {               // create a private constructor
		
	}
	public static Student getDetails() {
		return st;
		
	}
}
