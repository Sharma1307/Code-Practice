package com.inheritance;

import com.inheritance.Animal.Animal;
import com.inheritance.Birds.Eagle;
import com.inheritance.fish.Eel;
import com.inheritance.reptile.Crocodile;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal(); 
				
		Crocodile croco = new Crocodile();
		
		croco.setEgg("Hard-Sheeledlegs");
		System.out.println(croco);
		
		Eel eel = new Eel();
		eel.setSpecial("Eel are good Fish");
		
		
		System.out.println(eel.getSpecial());
			
		System.out.println(eel);
		
		Eagle eagle = new Eagle();
		
		System.out.println(eagle);
		
		System.out.println("This is the show Info Method  "+ eel.showInfo());
		
		
		
	}

}
