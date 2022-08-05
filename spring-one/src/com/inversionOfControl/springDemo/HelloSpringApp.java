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
	}

}
