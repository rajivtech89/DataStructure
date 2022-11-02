package com.rajiv.array;

import java.util.Arrays;

public class SearchIn2DArray {
	
	public static void main(String[] args) {
		int [][] arr= {
				{1,3,5,6},
				{11,55,66},
				{1,66}
		};
		
		int[] index= search(arr,66);
		System.out.println(Arrays.toString(index));
	}

	public static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target)
					return new int[] {row,col};
			}

		}
		return new int[] {-1,-1};
	}
}
