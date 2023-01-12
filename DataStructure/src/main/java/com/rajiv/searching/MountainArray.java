package com.rajiv.searching;

public class MountainArray {

	

	
	
	static int peakIndexInMountainArray(int[] arr) {
		int start=0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] >arr[mid+1]) {
			 //we are in decreasing part of array
			 // this may be the ans but look in left part
				end = mid;
			} else {
				// you are in asc part of array
				start = mid +1;
			} 
		}
			// in the end star== end  and ponting to the largest number
		return start;
	}
	
	public static void main(String[] args) {
		int[] arr = {11,12,14,16,7,8,9};
		System.out.println(peakIndexInMountainArray(arr));
	}
}
