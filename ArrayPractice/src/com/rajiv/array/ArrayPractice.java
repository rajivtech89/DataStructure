package com.rajiv.array;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		ArrayPractice.printSubArrays(numbers);;
	}

	public static void printSubArrays(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(numbers[j]);
			}
			System.out.println();
		}
	}

}
