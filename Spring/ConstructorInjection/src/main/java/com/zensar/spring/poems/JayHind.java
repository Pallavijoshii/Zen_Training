package com.zensar.spring.poems;

public class JayHind implements Poem {

	private final static String LINES [] = {
			"JAY HIND",
			"VANDE MATRAM",
			"INQUILLAB ZINDABAD",
			"BHARAT MATA KI JAY...."
	};
	
	public JayHind() {
		for(String line: LINES)
			System.out.println(line);
	}
	
	
	public void recite() {
		// TODO Auto-generated method stub

	}

}
