package com.inheritance.reptile;

public class Crocodile extends Reptile{

	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType
				+ ", getSkin()=" + getSkin() + ", getEgg()=" + getEgg() + ", isBackbone()=" + isBackbone()
				+ ", toString()=" + super.toString() + ", getHeightInFeet()=" + getHeightInFeet()
				+ ", getWeightInKilos()=" + getWeightInKilos() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	

}
