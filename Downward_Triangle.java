package com.starpattern.numbers;

/**
 * Question :
 * 1. Downward_Triangle Pattern programs in Java. 
 */

/**
 * @author Satish
 */

public class Downward_Triangle {
	
	public static void main(String[] args) {
		// Loop to print rows
		for (int i = 5; i >= 1; i--) {
			// Loop to print asterisks in each row
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}