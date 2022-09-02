package com.inversionOfControl.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); // coach.class is an interface. TrackCoach implements the coach.class interface
		// "myCoach" is the id given in applicationContext.xml for the bean
		Coach newCoach = context.getBean("secondCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyWorkout());
		
		// call new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
		
		System.out.println("new code");
		
		TrackCoach run = new TrackCoach();
		
		System.out.println(run.getDailyWorkout());
		/*
		 * applicationContext.xml loads the beans for mycaoch and secondcoach,
		 * also loads the dependency of HappyFortuneService
		 * 
		 * when we call theCoach.getDailyFortune(), theCoach refers to myCoach id bean, 
		 * which in the .xml file is TrackCoach.
		 * Track has a parameter input from FortuneService. this fortuneservice is 
		 * referenced in the constructor injection "myFortuneService"
		 * "myFortuneService" is defined as a dependency in the .xml file as HappyFortuneService.
		 * HappyFortuneService has a string .getFortune(). this .getFortune() is overrided in Track Coach
		 * as getDailyFortune()
		 * 
		 */
	}

}
