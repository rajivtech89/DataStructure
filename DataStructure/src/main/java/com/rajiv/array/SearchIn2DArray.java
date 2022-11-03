package com.rajiv.array;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 5, 6 }, { 11, 100, 66 }, { 1, 66 } };

		int[] index = search(arr, 66);
		// System.out.println(Arrays.toString(index));
		//System.out.println(max(arr));
		int[] nums= {12,345,12,16,7896};
		System.out.println(findNumbers(nums));
	}

	public static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target)
					return new int[] { row, col };
			}

		}
		return new int[] { -1, -1 };
	}

	public static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;

		for (int[] row : arr) {
			for (int element : row) {
				if (element > max)
					max = element;
			}
		}
		return max;
	}

	// given an array nums of integers, return how many of them contain an even
	// number of digits
	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}

	private static boolean even(int num) {
		int numberOfDigits = digits(num);
		if (numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	private static int digits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	
}
