package com.inhertence;

public class Bike extends Vehical {

	private String handel;

	
	public Bike(String engine, int wheels, int seats, int fueltank, String lights, String handel) {
		super(engine, wheels, seats, fueltank, lights);
		this.handel = handel;
	}

	public String run() {
		return "Bike Running";
	}
	
	public String getHandel() {
		return handel;
	}


	@Override
	public String toString() {
		return "Bike [handel=" + handel + ", getHandel()=" + getHandel() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank()
				+ ", getLights()=" + getLights() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
		
	
}
