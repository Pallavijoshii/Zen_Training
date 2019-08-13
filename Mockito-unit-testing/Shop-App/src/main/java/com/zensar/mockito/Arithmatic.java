package com.zensar.mockito;

public class Arithmatic {

	private Calculator calculator;
	

	public Arithmatic() {
		super();
	}


	public Arithmatic(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public int doAddition(int x,int y) {
		return calculator.add(x, y);
	}
	
	
}
