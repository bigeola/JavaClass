package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//Define bean for sad fortunes
	@Bean
	public FortuneService sadFortunes() {
		return new SadFortune();
	}
	
	//Define bean for volleyball fortune
	@Bean
	public FortuneService volleyBallFortune() {
		return new VolleyBallFortune();
		
	}
	
	//Define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortunes());
	}

	//Define bean for volleyball coach
	@Bean
	public Coach volleyBallCoach() {
		return new VolleyballCoach(volleyBallFortune());
	}
	
	}
