package com.rajiv.array;

public class DutchFalgArray {

	public static void main(String[] args) {
		int[] array= {0,1,0,2,2,0,1};
		DutchFalgArray obj = new DutchFalgArray();
		
		int[] numbers= obj.sortZeroOneTwo(array);
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
	

	public int[] sortZeroOneTwo(int[] array) {
		int low = 0, mid = 0, high = array.length-1;
		int temp;
		while (mid <= high) {
			switch (array[mid]) {
			case 0: {
				temp = array[low];
				array[low] = array[mid];
				array[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = array[mid];
				array[mid] = array[high];
				array[high] = temp;
				high--;
				break;
			}

			}

		}
		return array;
	}
}
