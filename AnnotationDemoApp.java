package com.lovecode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get the bean from spring container
		Coach Couves = context.getBean("basketballCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(Couves.getDailyWorkout());
		
		//call a method to get the daily fortune
		System.out.println(Couves.getDailyFortune());
		
		//close the context
		context.close();
	
	}

}
