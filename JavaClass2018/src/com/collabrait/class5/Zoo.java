package com.collabrait.class5;

public class Zoo {
	public static void main(String[] args) {
		Animal  a1 = new Cat();
		a1.makeNoise();
		a1.move();
		
		
		Cat ct = new Cat();
		ct.drinkMilk();
		
		Animal a2 = new Dog();
		a2.makeNoise();
		a2.move();
		
		
		Dog dg = new Dog();
		dg.run();
	}

}
