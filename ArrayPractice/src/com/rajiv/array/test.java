package com.rajiv.array;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i +" = "+ num*i);
		}
	}
}
