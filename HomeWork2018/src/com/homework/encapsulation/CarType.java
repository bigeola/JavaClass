package com.homework.encapsulation;

/*
 * This code was written by Emmanuel Olaleye
 * It is an example of encapsulation and inheritance.
 * 
 */
public class CarType extends EncapsCar {
	public static void main(String[] args) {

		// creating objects honda, toyota, porsche.
		CarType honda = new CarType();
		CarType toyota = new CarType();
		CarType porsche = new CarType();

		// Initializing the object honda
		honda.setCarMake("Honda");
		honda.setCarModel("Accord");
		honda.setColor("White");
		honda.setNumdoors(4);
		honda.setYear(2018);
		

		// Printing out the object
		System.out.println("This is the details of Honda we have in stock.");
		System.out.println("The car make is" + " " + honda.getCarMake());
		System.out.println("The car model is " + " " + honda.getCarModel());
		System.out.println("The color of the car is " + " " + honda.getColor());
		System.out.println("The car has " + honda.getNumdoors()+ " doors.");
		System.out.println("The car was made in " + honda.getYear() + "\n");

		// Initializing the toyota object
		toyota.setCarMake("Toyota");
		toyota.setCarModel("Camry");
		toyota.setColor("Black");
		toyota.setNumdoors(4);
		toyota.setYear(2018);

		// Printing out the object
		System.out.println("This is the details of Toyota we have in stock. ");
		System.out.println("The car manufacturer is " + toyota.getCarMake());
		System.out.println("The car model is a " + toyota.getCarModel());
		System.out.println("The color of the car is " + toyota.getColor());
		System.out.println("The car has " + toyota.getNumdoors() + " doors.");
		System.out.println("The car was manufactured in " + toyota.getYear() + "\n");

		// Initializing the porsche object
		porsche.setCarMake("Porsche");
		porsche.setCarModel("Panamera");
		porsche.setColor("Gold");
		porsche.setNumdoors(8);
		porsche.setYear(2032);

		// Printing out the object
		System.out.println("This is the details of porsche we have in stock. ");
		System.out.println("The car manufacturer is " + porsche.getCarMake());
		System.out.println("the car model is " + porsche.getCarModel());
		System.out.println("The color of the car is " + porsche.getColor());
		System.out.println("The car will have " + porsche.getNumdoors()+ " doors.");
		System.out.println("The car will be manufactured in " + porsche.getYear() + "\n");
	}

}
