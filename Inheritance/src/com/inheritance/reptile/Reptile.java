package com.inheritance.reptile;

import com.inheritance.Animal.Animal;

public class Reptile extends Animal{
	
	
	protected String skin; 
	protected String egg;
	protected boolean backbone;
	
	
	
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getEgg() {
		return egg;
	}
	public void setEgg(String egg) {
		this.egg = egg;
	}
	public boolean isBackbone() {
		return backbone;
	}
	public void setBackbone(boolean backbone) {
		this.backbone = backbone;
	}
	
	@Override
	public String toString() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType
				+ ", getSkin()=" + getSkin() + ", getEgg()=" + getEgg() + ", isBackbone()=" + isBackbone()
				+ ", getHeightInFeet()=" + getHeightInFeet() + ", getWeightInKilos()=" + getWeightInKilos()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
