package com.inversionOfControl.springDemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the object
		Coach theTrackCoach = new TrackCoach();
		
		Coach theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyWorkout());

	}

}
