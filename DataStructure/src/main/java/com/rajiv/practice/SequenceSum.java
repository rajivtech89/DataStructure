package com.rajiv.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceSum {

	private static int getSequenceSUm(int i, int j, int k) {
		int m, n, sum1 = 0, sum2;
		for (m = i; m <= j; m++) {
			sum1 = sum1 + m;
		}
		sum2 = sum1;
		for (n = j; n > k; n--) {
			sum2 = sum2 + (n - 1);
		}
		return sum2;
	}

	public static void closestNumbers(int[] numbers) {
		Arrays.sort(numbers);
		int minDiff = Integer.MAX_VALUE;
		String out = "";
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i + 1] - numbers[i] <= minDiff) {
				if (numbers[i + 1] - numbers[i] == minDiff) {
					out += " " + numbers[i] + " " + numbers[i + 1];
				} else {
					out = numbers[i] + " " + numbers[i + 1];
				}
				minDiff = numbers[i + 1] - numbers[i];
			}
		}
		System.out.println(out);

	}

	public static void closest(int[] numbers) {
		Arrays.sort(numbers);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length - 1; i++) {
			min = Math.min(min, numbers[i + 1] - numbers[i]);
		}
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i + 1] - numbers[i] == min) {
				System.out.println(numbers[i] + " " + numbers[i + 1]);
			}
		}
	}


	
	
	// find first last position of an element in an array
	public static int[] firstAndLastOccurence(int[] arr, int target) {
		int [] ans = {-1,-1};
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start+end)/2;
			if (arr[mid] == target) {
			ans[0]=mid;
			end=mid-1;
			}else if(arr[mid] <target) {
				start=mid+1;
			}else {
				end = mid-1;
			}
		}
		
		 start = 0;
		 end = arr.length - 1;
		while (start <= end) {
			int mid = (start+end)/2;
			if (arr[mid] == target) {
			ans[1]=mid;
			start=mid+1;
			}else if(arr[mid] <target) {
				start=mid+1;
			}else {
				end = mid-1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		/*
		 * int i, j, k; Scanner in = new Scanner(System.in); i = in.nextInt(); j =
		 * in.nextInt(); k = in.nextInt(); System.out.println(getSequenceSUm(i, j, k));
		 */

		/*
		 * Scanner in = new Scanner(System.in); int n = in.nextInt(); int[] numbers =
		 * new int[n]; for (int i = 0; i < n; i++) { numbers[i] = in.nextInt(); }
		 * closest(numbers);
		 */
		
		int [] arr= {1,5,7,7,7,7,8};
		int [] result= firstAndLastOccurence(arr, 11);
		System.out.println(result[0]+" "+result[1]);
	}
}
