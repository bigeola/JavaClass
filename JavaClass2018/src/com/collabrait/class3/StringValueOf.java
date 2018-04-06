package com.collabrait.class3;

public class StringValueOf {
	public static void main(String[] args) {
		int i = 10;
		float f = 10.10f;
		long l = 111L;
		double d = 2222.22;
		char ch = 'A';
		char array[] = {'a', 'b', 'c'};
		
		String str1 = String.valueOf(i);
		System.out.println(str1);
		
		String str2 = String.valueOf(f);
		System.out.println(str2);
		
		String str3 = String.valueOf(l);
		System.out.println(str3);
		
		String str4 = String.valueOf(d);
		System.out.println(str4);
		
		String str5 = String.valueOf(ch);
		System.out.println(str5);
		
		String str6 = String.valueOf(array);
		System.out.println(str6);
		
		String str7 = new String(array);
		System.out.println(str7);
	}

}
