package com.starpattern.numbers;

/**
 * Question :
 * 1. Upward_Triangle Pattern programs in Java. 
 */

/**
 * @author Satish Nirmal
 */
public class Upward_Triangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}