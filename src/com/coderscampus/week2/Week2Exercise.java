package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Exercise {

	public static void main(String[] args) {
		System.out.println("Type in a number. If it's not between 50 and 300, you'll be sorry.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		
		if ((convertedInput < 50) | (convertedInput > 300)) {
			System.out.println("No!");
		}
		else {
			System.out.println("Yes!");
		}
	}

}
