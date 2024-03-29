package com.rajiv.stack;

import java.util.Stack;

public class StringReverse {

	public static String reverseString(String str) {
		Stack<Character> stack = new Stack();
		char[] chars = str.toCharArray();
		
		for(char c: chars) {
			stack.push(c);
		}
		for(int i=0;i<str.length();i++) {
			chars[i]=stack.pop();
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		String str="ABCD";
		System.out.println("String before reverse : "+str);
		System.out.println("String after reverse: "+StringReverse.reverseString(str)); 
		
		
	}
}
