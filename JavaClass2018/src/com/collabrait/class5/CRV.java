package com.collabrait.class5;

public class CRV extends Car{

	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		System.out.println("A CRV has a round steering wheel that steers its wheels");
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		System.out.println("A CRV can have a 4 cylinder or a 6 cylinder engine.");
	
		
	}

	@Override
	public void hasCarbody() {
		// TODO Auto-generated method stub
		System.out.println("The body type of the CRV is known as the hatch back body type.");
		
	}
	
	public void ugly() {
		System.out.println("The CRV is an ugly car");
	}
	

}
