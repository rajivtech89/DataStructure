package com.rajiv.array;

public class SearchArray {

	public static void main(String[] args) {
		int [] array= {1,2,3,4,5};
		int index = SearchArray.searchIndex(array, 211);
		if(index ==-1)
			System.out.println("value does not exist in array");
		else
			System.out.println("value present at index "+index);
		
	}

	//Brute force
	public static int searchIndex(int[] array, int value) {
		if (array.length == 0)
			return -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value)
				return i;
		}
		return -1;
	}
}
