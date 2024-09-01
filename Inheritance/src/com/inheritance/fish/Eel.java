package com.inheritance.fish;

public class Eel extends Fish {
	
	private String special;
	
	
	

	

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String showInfo() {
		return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet="
				+ heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + ", getSpecial()=" + getSpecial() + ", isWaterBone()=" + isWaterBone() + ", isGills()="
				+ isGills() + ", toString()=" + super.toString() + ", getHeightInFeet()=" + getHeightInFeet()
				+ ", getWeightInKilos()=" + getWeightInKilos() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
