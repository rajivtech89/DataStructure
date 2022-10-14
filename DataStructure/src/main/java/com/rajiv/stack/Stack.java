package com.rajiv.stack;

public class Stack {
	private int array[];
	private int top;
	private int capacity;

	Stack(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}

	public void push(int data) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		}
		array[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top--];
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}

		return array[top];
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == capacity - 1;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(2);
		s.push(1);
		s.push(22);
		s.pop();
		
		System.out.println(s.peek());
	}
}
