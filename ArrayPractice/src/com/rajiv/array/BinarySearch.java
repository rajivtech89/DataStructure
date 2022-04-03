package com.rajiv.array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 11, 44, 55, 66, 88 };

		int index = searchIndex(array, 11, 0, array.length);
		if (index == -1)
			System.out.println("value does not exist");
		else
			System.out.println("value present at index " + index);
	}

	public static int searchIndex(int[] array, int value, int start, int end) {
		if (array.length == 0 || start > end)
			return -1;
		int mid = (start + end) / 2;
		if (value == array[mid])
			return mid;
		if (value < array[mid])
			return searchIndex(array, value, start, mid - 1);
		else
			return searchIndex(array, value, mid + 1, end);

	}
}
