package com.coderscampus.week2;

public class Week2Example {
	
	public static void main (String[] args) {
		int age = 21;
		
		if (age >= 19) {
			System.out.println("You are an adult.");
		} 
		if (age > 65) {
			System.out.println("You are a senior. Eligible for a discount at DD.");
		} else if (age >= 13) {
			System.out.println("You're not a senior, but");
			System.out.println("you are a teenager.");
		} else if (age == 12) {
			System.out.println("You are 12, and don't know what this is.");
		}
		else {
			System.out.println("You are a mere CHILD!");
		}
		
		String output = "Your age is " + age + ".";
		
		System.out.println(output);
		
		if (output.equals("Your age is 18.")) {
			System.out.println("You can vote.");
		} else if (output.equals("Your age is 21.")) {
			System.out.println("Vote for more casinos!");
		}
	}
}
