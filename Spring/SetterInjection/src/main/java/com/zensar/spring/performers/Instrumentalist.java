package com.zensar.spring.performers;
 
import com.zensar.spring.performers.Performer;
 
public class Instrumentalist implements Performer {
 
	private String song;
	private Instrumentalist instrument;
 
 
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing "+song);
 
	}
 
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}
 
	public void setInstrument(Instrumentalist instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set"); 
	}
 
}