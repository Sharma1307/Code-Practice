package com.inheritance.Birds;

import com.inheritance.Animal.Animal;

public class Bird extends Animal {

	protected boolean feather;
	protected boolean canFly;

	

	public boolean isFeather() {
		return feather;
	}

	public void setFeather(boolean feather) {
		this.feather = feather;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	@Override
	public String toString() {
		return "Bird [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet + ", weightInKilos="
				+ weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + ", isFeather()="
				+ isFeather() + ", isCanFly()=" + isCanFly() + ", getHeightInFeet()=" + getHeightInFeet()
				+ ", getWeightInKilos()=" + getWeightInKilos() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
