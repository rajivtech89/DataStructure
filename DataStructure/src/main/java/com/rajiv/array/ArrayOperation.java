package com.rajiv.array;

import java.util.Scanner;

public class ArrayOperation {

	public static int[] takeArrayAsInput() {
		Scanner in = new Scanner(System.in);
		int arrayLength = in.nextInt();
		int[] array= new int[arrayLength];
		for(int i=0;i<array.length;i++) {
			array[i]= in.nextInt();
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int num : array) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		int[] array= ArrayOperation.takeArrayAsInput();
		ArrayOperation.printArray(array);
		
		
	}
}
