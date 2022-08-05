package com.annotations.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileFortuneServiceApp {

	public static void main(String[] args) {
		// initialize bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// run context
		System.out.println("pre context.getBean() from filefortuneserviceapp.java");

		FortuneService fortune = context.getBean("fileFortuneService", FortuneService.class);
		
		// run methods
		System.out.println(fortune.getFortune());
		System.out.println("post fortune.getFortune() from filefortuneserviceapp.java");
		// close bean
		context.close();
	}

}
