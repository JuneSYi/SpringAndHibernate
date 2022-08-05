package com.annotations.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] arr = {"Fortune index 0", "Fortune index 1", "Fortune index 2"};
	
	// random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(arr.length);
		String theFortune = arr[index];
		return theFortune;
	}

}
