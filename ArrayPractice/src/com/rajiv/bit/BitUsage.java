package com.rajiv.bit;

import java.util.Scanner;

public class BitUsage {

	public static void main(String[] args) {

		BitUsage.findOddEven(11);
		BitUsage.swapNumbers(5, 7);
		BitUsage.isKthBitSet(5, 2);
		BitUsage.setKthBitSet(5, 2);
		BitUsage.clearKthBit(5, 1);
		BitUsage.countSetBit(5);

		int arraySize;
		Scanner sc = new Scanner(System.in);
		arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}

		BitUsage.findSingleElement(array);
	}

	public static void findSingleElement(int[] array) {
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			result = result ^ array[i];
		}
		System.out.println(result);
	}

	public static void findOddEven(int number) {
		if ((number & 1) == 0) {
			System.out.println("No is even");
		} else {
			;
			System.out.println("No is odd");
		}
	}

	public static void swapNumbers(int firstNumber, int secondNumber) {

		System.out.println("Numbers beofre swaping " + firstNumber + " : " + secondNumber);
		firstNumber = firstNumber ^ secondNumber;
		secondNumber = firstNumber ^ secondNumber;
		firstNumber = firstNumber ^ secondNumber;

		System.out.println("Numbers after swaping " + firstNumber + " : " + secondNumber);
	}

	public static void isKthBitSet(int n, int k) {
		if ((n & (1 << (k - 1))) > 0)
			System.out.println(k + " bit is SET in number " + n);
		else
			System.out.println(k + " bit is not SET in number " + n);
	}

	public static void setKthBitSet(int n, int k) {
		if ((n | (1 << (k - 1))) > 0)
			System.out.println(k + " bit is SET in number " + n);
		else
			System.out.println(k + " bit is not SET in number " + n);
	}

	public static void clearKthBit(int number, int k) {
		int mask = (1 << (k - 1));

		number = number & (~mask);
		System.out.println("The number after clear the bit in the given position is: " + number);
	}

	public static void countSetBit(int number) {
		int count = 0;
		while (number > 0) {
			if ((number & 1) == 1) {
				count++;
			}
			number >>= 1;
		}
		System.out.println("Number of set bit is :" + count);
	}
}
