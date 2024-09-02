package com.poly;

public class Main {

	public static void main(String[] args) {
	
//		Phone phone = new Phone();
//		phone.feature();
		
//		Noika910 noika = new Noika910();
//		noika.feature();
//		
//		Iphone15 iphone = new Iphone15();
//		iphone.feature();
		
		Phone phone;
		
		phone = new Noika910();
		phone = new Iphone15();
		phone = new Phone();
		
		phone.feature();		
		
	}

	// Polymorphisum divided into two form poly and morphisum "it means method have many form"
	// In PolyMorphosum we have reference of base class and create a object of all the child class "means beta ko baap ke jood m baithana"
	
//	allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.
}
