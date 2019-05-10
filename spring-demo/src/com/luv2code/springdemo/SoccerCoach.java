package com.luv2code.springdemo;



public class SoccerCoach implements Coach{
	
	// Creating an object of FortuneService Datatype
	private FortuneService fortuneService;
	
	//creating a literal
	private String emailAddress;
	
	private String team;
	
	// No Argument constructor
	public SoccerCoach() {
		System.out.println("SoccerCoach: Inside no-Argument Constructor");
	}
	
	// Parameter constructor
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// Setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("SoccerCoach: Inside Setter method - SetFortuneServices");
	}


	// Getters and Setters
	
	public String getEmailAddress() {
		return emailAddress;
		
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("SoccerCoach: Inside Setter method - SetEmailAddress");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("SoccerCoach: Inside Setter method - SetTeam");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Take 100 Shots per day with your weak foot";
	}

	@Override
	public String getDailyFortune() {
		return "Feel good about this because " + fortuneService.getFortune();
	}
	

}
