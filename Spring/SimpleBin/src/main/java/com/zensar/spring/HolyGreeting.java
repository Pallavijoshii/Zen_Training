package com.zensar.spring;
/*
* Author: SHIVAM SHUKLA
* Creation Date: 27th July 2019 12.56PM IST
* Modified Date: 27th July 2019 12.56PM IST
* Version:1.0
* Copyright: Zensar Technologies. All rights reserved.
* Description: It is specialized greeting used to greet anybody on occasion of Holi Festival.
* 
**/
public class HolyGreeting implements Greeting {

	public HolyGreeting() {
		System.out.println("Holy_Greeting Created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}

}
