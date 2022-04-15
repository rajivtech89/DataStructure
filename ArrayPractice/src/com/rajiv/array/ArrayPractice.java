package com.rajiv.array;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int[] numbers = {1,12,3,44,2};
	//	ArrayPractice.printSubArrays(numbers);
		//ArrayPractice.printElementGreaterThanEqualToRightSide(numbers);
		ArrayPractice.printElementGreaterThanEqualToRightSide(numbers);
	}

	public static void printSubArrays(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <numbers.length; j++) {
				for(int k=i;k<=j;k++) {
					System.out.println(numbers[k]);
				}
			}
			System.out.println();
		}
	}
	
	public static void printElementGreaterThanEqualToRightSide(int[] array) {
		int max= Integer.MIN_VALUE;
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]>max) {
				max=array[i];
				System.out.println(array[i]+" ");
			}
		}
	}

	public static void printElementGreaterEqualToRight(int [] array) {
		int max = Integer.MIN_VALUE;
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]>max) {
				max = array[i];
				System.out.println(max);
			}
		}
	}
}
