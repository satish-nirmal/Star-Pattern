package com.starpattern.numbers;

/**
 * Question :
 * 1. print Program3_RightDown star program. 
 */
/**
 * @author Satish Nirmal
 */

public class Program3_RightDown {

	public static void main(String[] args) {

		// size of the triangle
		int size = 5;
		for (int i = 0; i < size; i++) {
			// print spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// print stars
			for (int j = size; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
						// System.out.println();

		}
	}
}