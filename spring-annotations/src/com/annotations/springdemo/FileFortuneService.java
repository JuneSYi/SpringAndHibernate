package com.annotations.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName = "C:/Users/junes/OneDrive/Desktop/GitHub/spring-demo-annotations/src/realPractice.txt";
	private List<String> theFortunes;
	
	// random number generator
	private Random myRandom = new Random();

	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside FileFortuneService() constructor");

	}
	
	@Override
	public String getFortune() {
		System.out.println("This is inside the getFortune() of FileFortuneService class. \n Fortune coming up: ");
		
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}
	
	// define my init method
	@PostConstruct
	public void loadTheFortuneFile() {
		System.out.println(">> FileFortuneService: inside loadTheFortuneFile() with @PostConstruct on it");
		File theFile = new File(fileName);
		
		System.out.println("Reading from the file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initializing the array list
		theFortunes = new ArrayList<String>();
		
		// read the file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
