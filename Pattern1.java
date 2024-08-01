package com.starpattern.numbers;

/**
 * Question :
 * 1. print the all stars in 5 format. 
 */

/**
 * @author Satish Nirmal
 */

public class Pattern1 {

	public static void main(String[] args) {

		// Outer loop for number of rows
		for (int i = 1; i <= 5; i++) {

		// Inner loop for number of stars in each row
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");

			}
			// Move to the next line after printing stars in each row
			System.out.println("");
		}
	}
}
