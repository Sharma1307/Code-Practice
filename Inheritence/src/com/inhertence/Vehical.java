package com.inhertence;


// This is for the defult constructor 
public class Vehical {
	
	private String engine;
	private int wheels;
	private int seats;
	private int fueltank;
	private String lights;
	
	
	public String run() {
		return "Vehical Running";
	}
	
	
	
	public Vehical(String engine, int wheels, int seats, int fueltank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueltank = fueltank;
		this.lights = lights;
	}



	public String getEngine() {
		return engine;
	}



	public int getWheels() {
		return wheels;
	}



	public int getSeats() {
		return seats;
	}



	public int getFueltank() {
		return fueltank;
	}



	public String getLights() {
		return lights;
	}
		
	
	
}
