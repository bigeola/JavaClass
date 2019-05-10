package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> array = new ArrayList<>();
		
		List<String> array2 = new ArrayList<>();
		
		array.add("test1");
		array.add("test2");
		array.add("notest");

		array2.add("test1");
		array2.add("test2");
		array2.add("notest");
		array2.add("white");
		
		System.out.println(array);
		System.out.println(array2);
		
		
		
		array2.remove("test1");
		System.out.println(array2);
		
		
	}

}
