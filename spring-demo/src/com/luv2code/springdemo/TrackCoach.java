package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k mile";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! "+fortuneService.getFortune();
	}
	
	//Add an init-method that will be used for bean initialization
	public void doMyStartupStuff() {
		System.out.println("\nInside TrackCoach: doMyStartupStuff");
	}
	
	//Add a destroy-method to destroy bean after use
	public void doMyCleanupStuffYoYo() {
		System.out.println("\nInside TrackCoach: doMyCleanupStuffYoYo");
	}

}
