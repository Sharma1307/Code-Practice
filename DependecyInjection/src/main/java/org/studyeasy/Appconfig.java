package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.car.Corolla;

@Configuration
@ComponentScan("org.studyeasy")
public class Appconfig {
	
	@Bean("corolla")
	
	public Corolla corolla() {
		return new Corolla();
		
	}
	
	
	

}
