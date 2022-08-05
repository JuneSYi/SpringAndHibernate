package com.inversionOfControl.springDemo;
import java.util.Random;

public class RandomFortuneGenerator implements FortuneService {

	private String[] data = {"Fortune 1", "Fortune 2", "Fortune 3"};
	
	private Random randomNumber = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array;
		int index = randomNumber.nextInt(data.length);
		
		String theChosenOne = data[index];
		return theChosenOne;
	}

}
