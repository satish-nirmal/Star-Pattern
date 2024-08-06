package com.starpattern.numbers;

/**
 * Question :
 * 1. Print Cross Pattern programs in Java. 
 */

/**
 * @author Satish
 */


public class CrossPattern {

	public static void main(String[] args) {
		int n = 7; // Must be odd

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				// Check if the current position is in the center row or center column
				if (i == n / 2 || j == n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}
