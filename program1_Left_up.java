package com.starpattern.numbers;

/**
 * Question :
 * 1. print Left_Triangle star program. 
 */
/**
 * @author Satish Nirmal
 */

public class program1_Left_up {

	public static void main(String args[]) {

		// size of the triangle
		int size = 5;
		// loop to print the pattern
		for (int i = 0; i < size; i++) {
			// print column
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}