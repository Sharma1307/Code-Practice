package com.intput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("What is You Name ?");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Name is " + name);
		
		System.out.println("\n");
		System.out.println("what is Your Age ?");
		
		int age = scanner.nextInt();
		
		System.out.println("My Age is: " + age);
		
		scanner.close();

	}

}
