package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("Festival")
public class FestivalGreeting implements Greeting {
	
	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("greeting created");
		
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy diwali";
	}

}
