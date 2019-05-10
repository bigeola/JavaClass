package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice everyday";
	}

	@Override
	public String getDailyFortune() {
		// Use Fortune Service to get Fortune
		
		return fortuneService.getFortune();
	}

}
