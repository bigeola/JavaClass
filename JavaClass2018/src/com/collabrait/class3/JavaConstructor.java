package com.collabrait.class3;

public class JavaConstructor {
	
	String fname;
	String lname;
	int age;
	

	/*
	 * There are two types of constructors
	 * 
	 * Java stipulates that a constructor starts with class name
	 * the first type of constructor is the constructor with parameters,
	 * while the second one is known as the no argument constructors.
	 */
	
	// Creating a constructor
	
	public JavaConstructor(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		
	}
	
	public JavaConstructor() {
		super();
	}
	
	public void  getCont() {
//		int num = 19;
		System.out.println("This is Java Cont class");
	}

}
