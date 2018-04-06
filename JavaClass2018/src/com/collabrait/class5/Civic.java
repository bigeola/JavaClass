package com.collabrait.class5;

public class Civic extends Car{
	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		System.out.println("A Civic has a size 14 wheels");
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		System.out.println("A Civic has a 6 cylinder engine.");
	
		
	}

	@Override
	public void hasCarbody() {
		// TODO Auto-generated method stub
		System.out.println("The body type of the Civic is known as the hatch back body type.");
		
	}
	
	public void Speed() {
		System.out.println("The Civic is a slow car");
	}

}
