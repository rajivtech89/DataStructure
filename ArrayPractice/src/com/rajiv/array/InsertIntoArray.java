package com.rajiv.array;

public class InsertIntoArray {
	private int count;

	public static void main(String[] args) {
		int[] numbers = new int[5];
		InsertIntoArray arraInsert = new InsertIntoArray();
		for (int i = 0; i < numbers.length; i++) {
			arraInsert.insert(numbers, i);
		}

		arraInsert.printArray(numbers);

		arraInsert.insertAtStart(numbers, 11);
		arraInsert.printArray(numbers);

		arraInsert.insertAtPosition(numbers, 0, 66);
		arraInsert.printArray(numbers);
	}

	public void insert(int[] array, int value) {
		array[count++] = value;

	}

	public void insertAtStart(int[] array, int value) {
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = value;
	}

	public void insertAtPosition(int[] array, int position, int value) {
		for (int i = array.length - 1; i > position; i--) {
			array[i] = array[i - 1];
		}
		array[0] = value;
	}

	public void printArray(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}