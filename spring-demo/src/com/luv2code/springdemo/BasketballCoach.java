package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService randFortunes;

	// No Argument Constructor
	public BasketballCoach() {
		System.out.println("Inside the no argument constructor");
	}

	//Parmeterized Constructor
	public BasketballCoach(FortuneService randFortunes) {
		this.randFortunes = randFortunes;
	}
	
	
	
	public void setRandFortunes(FortuneService randFortunes) {
		this.randFortunes = randFortunes;
		System.out.println("Inside Setter method: setRandFortunes");
	}

	@Override
	public String getDailyWorkout() {
		return "To be like Steph Curry, you have to practice your ball handling"
				+ " and shooting skills for 2 solid hours";
	}


	@Override
	public String getDailyFortune() {
		return randFortunes.getFortune();
	}

}
