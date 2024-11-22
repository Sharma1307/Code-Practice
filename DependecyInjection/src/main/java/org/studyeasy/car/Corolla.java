package org.studyeasy.car;

import org.springframework.stereotype.Component;
import org.studyeasy.Inter.Car;


public class Corolla implements Car{

	@Override
	public void spece() {
		
		System.out.println("Coralla form the Car Interface !!!");
		
	}

}
