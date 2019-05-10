package com.luv2code.springdemo;

public class VolleyballCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public VolleyballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice your serve and spike for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
