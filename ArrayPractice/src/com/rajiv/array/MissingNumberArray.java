package com.rajiv.array;

public class MissingNumberArray {

	public static void main(String[] args) {
		int [] array = {1,2,3,5,6};
		MissingNumberArray obj= new MissingNumberArray();
		int missingNumber = obj.findMissingNumber(array,array.length+1	);
		System.out.println(missingNumber);
		
	}
	public int findMissingNumber(int[] array,int totalElement) {
		int sum = (totalElement *(totalElement+1))/2;
		for(int i=0;i<array.length;i++) {
			sum =sum - array[i]; 
		}
		return sum;
	}
}
