package com.inheritance.Animal;

public class Animal {

	protected float heightInFeet;
	protected float weightInKilos;
	protected String animalType;
	protected String bloodType;

	

	public float getHeightInFeet() {
		return heightInFeet;
	}

	public void setHeightInFeet(float heightInFeet) {
		this.heightInFeet = heightInFeet;
	}

	public float getWeightInKilos() {
		return weightInKilos;
	}

	public void setWeightInKilos(float weightInKilos) {
		this.weightInKilos = weightInKilos;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	@Override
	public String toString() {
		return "Animal [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType="
				+ animalType + ", bloodType=" + bloodType + ", getHeightInFeet()=" + getHeightInFeet()
				+ ", getWeightInKilos()=" + getWeightInKilos() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
