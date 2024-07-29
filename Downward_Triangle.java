package com.starpattern.numbers;

/**
 * Question :
 * 1. Downward_Triangle Pattern programs in Java. 
 */

/**
 * @author Satish Nirmal
 */

public class Downward_Triangle {
	
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		  System.out.println();

		}
	}
}