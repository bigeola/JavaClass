package com.collabrait.class4;

public class ConstructorExample {
	
	String name;
	int age;
	
	ConstructorExample(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	ConstructorExample(){
		this.name = "Mike";
		this.age = 4;
	}
	
	public static void main(String [] args) {
		ConstructorExample const1 = new ConstructorExample();
		System.out.println(const1.name);
		
		ConstructorExample const2 = new ConstructorExample("Daniel",34);
		System.out.println(const2.name);
	}

}
