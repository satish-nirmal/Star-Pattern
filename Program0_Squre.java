package com.starpattern.numbers;

/**
 * Question :
 * 1. print Squre pattern star program. 
 */
/**
 * @author Satish Nirmal
 */

public class Program0_Squre {

	public static void main(String[] args) {

		// size of the square
		int size = 5;
		// outer loop
		for (int i = 0; i < size; i++) {
			// inner loop
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}