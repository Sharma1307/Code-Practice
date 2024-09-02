package com.type;

import com.type.overriding.Animal;
import com.type.overriding.Dog;

public class Main {

	public static void main(String[] args) {

		SumNumber sumnumber = new SumNumber();

		System.out.println(sumnumber.add(15, 10));

		System.out.println(sumnumber.add(34, 35, 86));
		
		Animal animal = new Dog();  // This is the Run Time Polymorphisum here super class as a reference and the Dog Class is the child class.override the sound method of parent class to the child class.
		
		animal.sound();
		
	}

}
