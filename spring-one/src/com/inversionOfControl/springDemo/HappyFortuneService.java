package com.inversionOfControl.springDemo;
import java.lang.Math;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today's fortune is that hard work will bring you success...eventually ;)";
	}

}
