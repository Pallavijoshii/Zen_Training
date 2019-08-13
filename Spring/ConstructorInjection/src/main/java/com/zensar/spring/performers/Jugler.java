package com.zensar.spring.performers;
/*
* Author: SHIVAM SHUKLA
* Creation Date: 27th July 2019 4.17PM IST
* Modified Date: 27th July 2019 4.17PM IST
* Version:1.0
* Copyright: Zensar Technologies. All rights reserved.
* Description: It represents performer Jugler of Zensar Idol Competition.
* Jugler gets bean bags using constructor injection.
**/
public class Jugler implements Performer {

	private int beanBags;
	
	public Jugler() {
		System.out.println("No-args Constructor");
	}
	
	public Jugler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("param constructor of Jugler");
	}

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Jugler jugling"+beanBags);
	}

}