package com.rajiv.array.rotate;

public class RotateArray {

	public static int[] rotate(int[] arr,int position) {
		int[] temp= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[(i+position)%arr.length] = arr[i];
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int[] arr= {11,44,22,1,4};
		int[] result=rotate(arr, 2);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
