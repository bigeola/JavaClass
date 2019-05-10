package com.collaborait.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GenericsApp {
	public static void main(String[] args) {
		pureGeneric();
		getUnionSetValues();
	}
	
	public static void pureGeneric() {
		PureGenericsClass<Integer, String> pg = new PureGenericsClass<Integer, String>(12, "DC");
		int num = pg.getItem1();
		String str = pg.getItem2();
		
		System.out.println(num);
		System.out.println(str);
		
		PureGenericsClass<String, String> pg2= new PureGenericsClass<String, String>("Washington", "DC");
		String str2 = pg2.getItem1();
		String str3 = pg2.getItem2();
		
		System.out.println(str2 + " " + str3);
		
		PureGenericsClass<Float, Double> pg3 = new PureGenericsClass<Float, Double>(12.99F, 3.14);
		
		Float sal1 = pg3.getItem1();
		Double sal2 = pg3.getItem2();
		
		System.out.println("Total Salary = " + sal1 + sal2);
		
		
		PureGenericsClass<String, Integer> pg4 = new PureGenericsClass<String, Integer>("Milan", 34);
		String name = pg4.getItem1();
		Integer age = pg4.getItem2();
		
		System.out.println(name + "'s age is " + age );
	}
	
	// Sample Generic method
	public static <E> Set<E> unionOfSets(Set<E> set1, Set<E> set2){
		Set<E> results = new TreeSet<>();
		results.addAll(set1);
		results.addAll(set2);
		
		return results;
	}
	
	public static void getUnionSetValues() {
		Set <String> string = new HashSet<String>();
		string.add("Mike");
		string.add("Nina");
		string.add("Paul");
		
		Set <String> num = new HashSet<String>();
		num.add("1");
		num.add("2");
		num.add("3");
		
		Set <String> resultSet = unionOfSets(string, num);
		
		Iterator<String> it = resultSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
