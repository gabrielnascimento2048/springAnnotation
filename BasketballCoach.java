package com.lovecode.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class BasketballCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService thefortuneService) {
		System.out.println(">>BasketballCoach: inside the default constructor");
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice every day for 1 hour!";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
