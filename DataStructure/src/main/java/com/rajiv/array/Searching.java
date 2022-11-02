package com.rajiv.array;

public class Searching {

	public static void main(String[] args) {
		int[] arr = { 1, 22, 44, 66, 3, -1, -7 };

		/*
		 * int target = -1; int index = linearSearchNumber(arr, target);
		 * System.out.println(index);
		 * 
		 * String str = "Jadeja"; char find = 'a'; int presentAtIndex =
		 * linearSearchString(str, find); System.out.println(presentAtIndex);
		 * 
		 */

		/*
		 * int index = searchInRange(arr, 1, 5, 66); System.out.println(index);
		 */
		
		int minNumber = findMin(arr);
		System.out.println(minNumber);

	}

	public static int linearSearchNumber(int[] arr, int target) {

		if (arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public static int linearSearchString(String str, char target) {

		if (str.length() == 0)
			return -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				return i;
			}
		}

		/*
		 * for(char ch :str.toCharArray()) { if(ch == target) return true; }
		 */

		return -1;
	}

	public static int searchInRange(int[] arr, int start, int end, int target) {

		if (arr.length == 0) {
			return -1;
		}
		for (int index = start; index <= end; index++) {
			if (target == arr[index])
				return index;
		}
		return -1;
	}

	public static int findMin(int[] arr) {
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}

		}
		return ans;
	}

}
