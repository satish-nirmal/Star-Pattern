package com.starpattern.numbers;

/**
 * Question :
 * 1. Square Star Pattern programs in Java. 
 */

/**
 * @author Satish
 */


public class Pattern3 {
	public static void main(String[] args) {

		// Outer loop for number of rows
		for (int i = 1; i <= 5; i++) {

			// Inner loop for number of stars in each row
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Move to the next line after printing stars in each row
			System.out.println();
		}
	}
}