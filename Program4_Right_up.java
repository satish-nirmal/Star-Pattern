package com.starpattern.numbers;

/**
 * Question :
 * 1. print Program4_Right_up direction star program. 
 */
/**
 * @author Satish
 */

public class Program4_Right_up {
	
	public static void main(String[] args) {

		int size = 5;
		
		for (int i = 0; i < size; i++) {
			// print spaces
			for (int j = 1; j < size - i; j++) {
				System.out.print(" ");
			}
			// print stars
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
