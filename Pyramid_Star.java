package com.starpattern.numbers;

/**
 * Question :
 * 1. Pyramid_Star Pattern programs in Java. 
 */

/**
 * @author Satish
 */

public class Pyramid_Star {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			// Print spaces
			
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			// Print asterisks
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}