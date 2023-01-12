package com.rajiv.searching;

public class InfiniteArray {

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid +1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	static int ans(int[] arr, int target) {
		int start = 0;
		int end = 1;

		while (target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		return binarySearch(arr, target, start, end);
	}
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,7,88,99,777};
		int  target=11;
		System.out.println(ans(arr,target));
	}
}
