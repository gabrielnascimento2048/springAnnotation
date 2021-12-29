package com.lovecode.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



//@Component
public class TennisCoach implements Coach {

	//define a private field for the dependency
	
	//@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	
		public TennisCoach() {
		System.out.println(">>TennisCoach: inside the default constructor");
		}
		
		//define my init method
		@PostConstruct
		public void postConstruct () {
			System.out.println(">>TennisCoach: inside of PostConstruct");
		}
		
		//define my destroy method
		@PreDestroy
		public void preDestroy () {
			System.out.println(">>TennisCoach: inside of PreDestroy");
		}
		
		/*
		@Autowired
		public void bananas(FortuneService thefortuneService) {
			System.out.println(">>TennisCoach: inside bananas() method");
				fortuneService = thefortuneService;
		}
		*/
	
	
		/*	//define a setter method
		@Autowired
		public void setFortuneService(FortuneService thefortuneService) {
			System.out.println(">>TennisCoach: inside setFortuneService() method");
				fortuneService = thefortuneService;
		}
		*/
		
	
		/*
		//Constructor Injection
         @Autowired
		public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
		*/
		
		
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand everyday, for 30 minutes! ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
