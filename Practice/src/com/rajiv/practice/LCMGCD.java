package com.rajiv.practice;

import java.util.Scanner;

public class LCMGCD {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int firstNumber = sc.nextInt();
	int secondNumber = sc.nextInt();
	int orig1 = firstNumber;
	int orig2 = secondNumber;
	
	while(firstNumber % secondNumber !=0) {
		int rem = firstNumber % secondNumber;
		firstNumber = secondNumber;
		secondNumber = rem;
	}
	int gcd= secondNumber;
	int lcm = (orig1 * orig2)/gcd;
	System.out.println("GCD :"+ gcd);
	System.out.println("LCM :"+ lcm);
	}
}
