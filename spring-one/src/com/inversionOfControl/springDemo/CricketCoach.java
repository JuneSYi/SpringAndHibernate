package com.inversionOfControl.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailaddress and team
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("diagnostic message to show that we're inside our setEmailAddress setter method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("diagnostic message to show that we're inside our setTeam setter method");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("diagnostic message to show that we're inside our constructor when spring calls this no-arg constructor");
	}
	
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("diagnostic message to show that we're inside our setFortuneService setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice cricket stuff for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
