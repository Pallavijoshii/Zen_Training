package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("Wishes")
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Anniversary greeting is created");
	}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary";
	}

}
