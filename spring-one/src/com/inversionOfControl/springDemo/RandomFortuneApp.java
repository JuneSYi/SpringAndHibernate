package com.inversionOfControl.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext foo = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		RandomFortuneGenerator randomFortune = foo.getBean("randomFortune", RandomFortuneGenerator.class); 
		
		// call methods on the bean
		System.out.println(randomFortune.getFortune());
		
		// close the context
		foo.close();

	}

}
