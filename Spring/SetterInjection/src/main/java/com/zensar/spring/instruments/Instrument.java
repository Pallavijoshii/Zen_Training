package com.zensar.spring.instruments;
 
import com.zensar.spring.performers.Performer;
 
public class Instrument implements Performer {
 
	private String song;
	private Instrument instrument;
 
 
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing "+song);
 
	}
 
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}
 
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set"); 
	}
 
}