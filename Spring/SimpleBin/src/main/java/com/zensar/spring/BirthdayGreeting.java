package com.zensar.spring;
/*
* Author: SHIVAM SHUKLA
* Creation Date: 27th July 2019 12.50PM IST
* Modified Date: 27th July 2019 12.50PM IST
* Version:1.0
* Copyright: Zensar Technologies. All rights reserved.
* Description: It is specialized greeting used to greet anybody on his/ her birthday.
* 
*/
public class BirthdayGreeting implements Greeting {
	public BirthdayGreeting() {
		// TODO Auto-generated constructor stub
	System.out.println("Birthday Greeting Created");
	}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Birthday!";
	}
}