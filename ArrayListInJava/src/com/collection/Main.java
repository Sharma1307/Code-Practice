package com.collection;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<>();	
	
		list.add("Akash");
		list.add("Anand");
		list.add("Pooja");
		list.add("Amit");
		list.add("Rajveer");
		
		System.out.println(list);
		
		list.remove(2);
		
		list.remove("Akash");
		
		System.out.println(list);
		
		
		list.set(0, "Rajveer");
		
		System.out.println(list);
		
		System.out.println(list.indexOf("Amit"));
		
		System.out.println(list.indexOf("Rajveer"));
		
		
		
		
		
		
		
		
	}

}
