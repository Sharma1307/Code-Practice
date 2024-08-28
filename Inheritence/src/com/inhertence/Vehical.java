package com.inhertence;


// This is for the defult constructor 
public class Vehical {
	
	private String engine;
	private int wheels;
	private int seats;
	private int fueltank;
	private String lights;
		
	public Vehical() {		
		engine = "petrol";
		wheels = 2;
		seats = 1;
		fueltank = 1;
		lights = "white";		
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
