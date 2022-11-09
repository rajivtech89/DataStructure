package com.rajiv.searching;

public class Ceiling {

	public static void main(String[] args) {
		int[] arr = { -11, -2, -1, 0, 22, 44, 55, 65, 88 };
		int target = 57;
		int resultIndex = ceiling(arr, target);
		
		System.out.println(arr[resultIndex]);
	}

	static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = false;
		if (arr[start] < arr[end]) {
			isAsc = true;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {

				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			}
		}
		return start;
	}

}
