package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {
	
	private Random random = new Random();

	String [] arr = {"You will win today", 
			"The world has got nothing on you",
			"You are the G.O.A.T"};
	
	
	@Override
	public String getFortune() {
		int index = random.nextInt(arr.length);
		return arr[index];
	}

}
