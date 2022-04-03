package com.rajiv.array;

public class DeleteFromArray {
	private static int count = 5;

	public static void main(String[] args) {
		int[] array = { 11, 22, 33, 44, 55 };
		DeleteFromArray delete = new DeleteFromArray();
		 delete.printArray(array);

		delete.deleteFromEnd(array);
		 delete.printArray(array);

		delete.deleteValue(array, 11);
		delete.printArray(array);

		delete.deleteFromPosition(array, 2);
		delete.printArray(array);

	}

	public void deleteFromEnd(int[] array) {
		if (array.length <= 0)
			return;
		count--;
	}

	public void deleteValue(int[] array, int value) {
		int i;
		for (i = 0; i < count; i++) {
			if (array[i] == value) {
				break;
			}
		}
		if (i == count) {
			System.out.println("Valeu does not exist in array");
			return;
		}

		for (int j = i; j < count - 1; j++) {
			array[j] = array[j + 1];
		}
		count--;
	}

	public void deleteFromPosition(int[] array, int position) {
		if (position > count || position <= 0) {
			System.out.println("Invalid position");
			return;
		}

		for (int i = position - 1; i < count - 1; i++) {
			array[i] = array[i + 1];
		}
		count--;
	}

	public void printArray(int[] array) {

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
