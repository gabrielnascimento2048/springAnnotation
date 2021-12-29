package com.lovecode.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
public String[] data = {
	"Beware of the wolf in sheep's clothing",	
	"Diligence is th mother of good lucky",	
	"The Journey is the reward"	
};	
   //create a random number generator

private Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array
		
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
