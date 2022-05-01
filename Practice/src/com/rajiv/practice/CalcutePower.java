package com.rajiv.practice;

public class CalcutePower {

	public static void main(String[] args) {
		CalcutePower.calculatePower(2, 3);
		
		for(int i=1;i<=10;i++) {
			int j = i >> 1;
		System.out.println(j);
		}
	}
	
	public static void calculatePower(int number, int power) {
		int result = 1;
		for(int i=0;i<power;i++) {
			result = result *number;
		}
		System.out.println(number +" raise to power "+power +" is "+result);
	}
}
