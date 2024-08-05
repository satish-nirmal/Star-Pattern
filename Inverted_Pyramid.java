package com.starpattern.numbers;

/**
 * Question :
 * 1. Inverted_Pyramid Star Pattern programs in Java. 
 */

/**
 * @author Satish Nirmal
 */

public class Inverted_Pyramid {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			// Print spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}