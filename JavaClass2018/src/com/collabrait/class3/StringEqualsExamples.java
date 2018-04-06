package com.collabrait.class3;

public class StringEqualsExamples {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = new String("HELLO");
		String str = new String("Quick brown fox jumps over the lazy dog");
		String str4 = String.join("-", "This","is","a","String");
		String [] arr = {"Mike", "Magic", "Peter"};
		String names = String.join("|", arr);

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals("Welcome"));
		System.out.println(str1.equals("Hello"));
		System.out.println(str1.equals("hello"));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str.substring(19));
		System.out.println(str.indexOf("brown"));
		System.out.println(str4);
		System.out.println(names);
		
		String str6 = " How are you ";
		System.out.println(str6.trim());
		
		
		

		/*
		 * str1 equals to str2: false 
		 * str1 equals to str3: true 
		 * str1 equals to Welcome:false 
		 * str1 equals to Hello:true 
		 * str1 equals to hello:false
		 */

	}
}
