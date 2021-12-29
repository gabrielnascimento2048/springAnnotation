package com.lovecode.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lovecode.springdemo")
@PropertySource("classpath:sport.properties")


public class SportConfig {
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach basketballCoach() {
		return new BasketballCoach(randomFortuneService());
	}
}
