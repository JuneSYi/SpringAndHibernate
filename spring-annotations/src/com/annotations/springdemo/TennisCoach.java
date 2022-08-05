package com.annotations.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



@Component
public class TennisCoach implements Coach {
	
	private String fileName = "practice.txt";
	private List<String> theFortunes;

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// default constructor
	public TennisCoach() {
		System.out.println("This is inside the default TennisCoach constructor");
	}
	
	// define my init method
	//@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupSTuff() with @PostConstruct on it");

	}
	
	// define my destroy method
	//@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupSTuff() with @PreDestroy on it");
	}
	
	/*
	// setter method
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("This is inside the TennisCoach setter method called doSomeCrazyStuff()");
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
