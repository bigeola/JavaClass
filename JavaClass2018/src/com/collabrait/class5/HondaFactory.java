package com.collabrait.class5;

public class HondaFactory {
	public static void main(String [] args) {
		Car c1 = new CRV();
		
		c1.hasCarbody();
		c1.hasEngine();
		c1.hasWheels();
		
		CRV c11 = new CRV();
		c11.ugly();
		System.out.println("\n");
		
		
		
		Car c2 = new Accord();
		c2.hasCarbody();
		c2.hasEngine();
		c2.hasWheels();
		
		Accord c22 = new Accord();
		c22.myFav();
		System.out.println("\n");
		
		
		Car c3 = new Civic();
		c3.hasCarbody();
		c3.hasEngine();
		c3.hasWheels();
		
		Civic c33 = new Civic();
		c33.Speed();
	}

}
