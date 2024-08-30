package com.inhertence;

public class Main {

	public static void main(String[] args) {
		
		Bike bike = new Bike("Rocket Engine", 2, 10, 1, "yello light", "multiple handle");
		
		Car car = new Car("Engin", 3, 4, 5, "white", "Right Sterrig", "sony-misic", "Top class", "boltas", "TV");
		

			System.out.println("Engine" + bike.getEngine());
			System.out.println("Fuel Tank" + bike.getFueltank());
			System.out.println("Seat" + bike.getSeats());
			System.out.println("Wheels" + bike.getWheels());
			System.out.println("Lignt" + bike.getLights());
			System.out.println("Handle" + bike.getHandel());
			
			
			System.out.println(bike);
			
			
			System.out.println(bike.run());
			
			// Always get the priority to the the child class.
			
			System.out.println(car);
			System.out.println(car.getAirconditionor());
			
			
			System.out.println(car.run());
	}

}
