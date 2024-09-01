package com.inheritance.fish;

import com.inheritance.Animal.Animal;

public class Fish extends Animal {

	

	protected boolean waterBone;
	protected boolean gills;
	
	public boolean isWaterBone() {
		return waterBone;
	}
	public void setWaterBone(boolean waterBone) {
		this.waterBone = waterBone;
	}
	public boolean isGills() {
		return gills;
	}
	public void setGills(boolean gills) {
		this.gills = gills;
	}
	
	@Override
	public String toString() {
		return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType
				+ ", isWaterBone()=" + isWaterBone() + ", isGills()=" + isGills() + ", getHeightInFeet()="
				+ getHeightInFeet() + ", getWeightInKilos()=" + getWeightInKilos() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
}
