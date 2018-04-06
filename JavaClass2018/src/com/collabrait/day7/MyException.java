package com.collabrait.day7;

public class MyException extends Exception{
	
	String str1;
	String str2;
	
	public MyException(String str2) {
		str1 = str2;
	}
	
	public String toString() {
		return("My Exceptions " + str1);
	}

}
