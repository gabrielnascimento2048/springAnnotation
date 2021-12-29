package com.lovecode.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		//Coach Couves = context.getBean("swimCoach",Coach.class);
		SwimCoach Couves = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(Couves.getDailyWorkout());
		
		//call a method to get the daily fortune
		System.out.println(Couves.getDailyFortune());
		
		//call our new swim coach methods ...has the props values injected
		System.out.println("email:"+ Couves.getEmail());
		System.out.println("team:"+ Couves.getTeam());
		
		//close the context
		context.close();
	
	}

}
