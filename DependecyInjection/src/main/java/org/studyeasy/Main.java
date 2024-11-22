package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.Inter.Car;

public class Main {

	public static void main(String[] args) {
		
//		Corolla corolla = new Corolla();
//
//		corolla.spece();
//
//		Swift swift = new Swift();
//
//		swift.spece();
						
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		
		Car mycar = context.getBean(Car.class);
		
		mycar.spece();
		context.close();
		
		
		
		
	}

}
