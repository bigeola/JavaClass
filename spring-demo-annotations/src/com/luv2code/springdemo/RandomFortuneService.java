package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private Random random = new Random();
	
	String[] arr = {
			"Beware of a wo;f in Sheep's skin",
			"Diligence is the mother of goodluck",
			"The journey is the reward"
	};
	
	
	@Override
	public String getDailyFortune() {
		int index = random.nextInt(arr.length);
		return arr[index];
	}

}
