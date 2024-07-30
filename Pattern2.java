package com.starpattern.numbers;

/**
 * Question :
 * 1. print the all stars in 5 format. 
 */

/**
 * @author Satish
 */

public class Pattern2 {

	public static void main(String[] args) {

        // Outer loop for number of rows
		for(int i = 1 ; i <= 5; i++) {
			
		// Inner loop for number of stars in each row
			for (int j = 1 ; j <= i ; j++) {

				System.out.print("* ");
			}
		}
		System.out.println("");

	}
}
