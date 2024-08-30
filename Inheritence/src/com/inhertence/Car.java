package com.inhertence;

public class Car extends Vehical{
	
	private String steering ;
	private String musicsystem;
	private String airconditionor;
	private String fridge;
	private String entertainmentssystem;
	
	
	public String run() {
		return "Car Running class first it get first priority to the child class if same method in the parents class";
	}
	
	
	public Car(String engine, int wheels, int seats, int fueltank, String lights, String steering, String musicsystem,
			String airconditionor, String fridge, String entertainmentssystem) {
		super(engine, wheels, seats, fueltank, lights);
		this.steering = steering;
		this.musicsystem = musicsystem;
		this.airconditionor = airconditionor;
		this.fridge = fridge;
		this.entertainmentssystem = entertainmentssystem;
	}

	@Override
	public String toString() {
		return "Car [steering=" + steering + ", musicsystem=" + musicsystem + ", airconditionor=" + airconditionor
				+ ", fridge=" + fridge + ", entertainmentssystem=" + entertainmentssystem + "]";
	}











	public String getSteering() {
		return steering;
	}



	public String getMusicsystem() {
		return musicsystem;
	}



	public String getAirconditionor() {
		return airconditionor;
	}



	public String getFridge() {
		return fridge;
	}



	public String getEntertainmentssystem() {
		return entertainmentssystem;
	}
	
	
	
	

}
