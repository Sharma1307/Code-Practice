package com.autoboxing;

import java.util.ArrayList;


class IntergerWrapper{
	 
	 public int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	 
	 
	 	
}

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(56); // AutoBoxing in java concept java do Automatically
		
		System.out.println(list.get(0));   // Auto unboxing in java 
			
		// Auto Boxing and Auto Unboxing concept in java automatically build 
		
		
		// Concept of boxing and unboxing 
		
		
		
		ArrayList<IntergerWrapper> listwrapper = new ArrayList<>();
		
		listwrapper.add(new IntergerWrapper());
		
		
	}
	
	
	 

}
