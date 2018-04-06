package com.collabrait.class5;

public class Accord extends Car{
	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		System.out.println("Honda Accord uses a size 16 wheel");
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		System.out.println("It has a 4 cylinder engine. Pretty small.");
	
		
	}

	@Override
	public void hasCarbody() {
		// TODO Auto-generated method stub
		System.out.println("The body type of the Accord is known as the Sedan body type.");
		
	}
	
	public void myFav() {
		System.out.println("The 2018 Accord model is my Favorite car");
	}

}
