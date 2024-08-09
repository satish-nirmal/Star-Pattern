package com.starpattern.numbers;

public class Program2_Left_Down {

	public static void main(String[] args) {

		// size of the triangle
		int size = 5;
		for (int i = 0; i < size; i++) {
			// print stars
			for (int j = 0; j < size - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}