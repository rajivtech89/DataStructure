import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		int[] array = new int[5];
		int[] numbers = new int[10];
		int size = 5;
		int numberToBeInserted = 11;
		ArrayBasic.arrayInitializationWithSize(numbers,size);
		//ArrayBasic.insertAtPosition(numbers, size, numberToBeInserted);
		// ArrayBasic.arrayInitialization(array);
		// ArrayBasic.printArrayElement(array);
		// ArrayBasic.dynamicArray(numbers);
		
		ArrayBasic.deleteAtPosition(numbers, size);
	}

	public static void arrayInitializationWithSize(int[] array, int size) {
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
	}

	public static void arrayInitialization(int[] array) {
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}

	public static void printArrayElement(int[] array) {
		System.out.println("Array elements are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void dynamicArray(int[] array) {
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size > array.length) {
			System.out.println("arrya size should be length then or equal to  " + array.length);

		} else {
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
		}
	}

	public static void insertAtPosition(int[] array, int size, int number) {
		System.out.println("Array before insertion");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		System.out.println("enter position where elment to be inserted in array");
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();

		for (int i = size-1; i >= position - 1; i--) {
			array[i+1] = array[i];
		}
	   array[position - 1] = number;
	   size++;
		System.out.println("Array after insertion");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void deleteAtPosition(int[] array,int size) {
		System.out.println("Array before insertion");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		System.out.println("enter position where elment to be deleted in array");
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();
		if(position <=0 || position >size) {
			System.out.println("This is not valid position for deletion");
		}else {
		for(int i=position -1;i<size -1;i++) {
			array[i] =array[i+1];
		}
		size --;
		}
		System.out.println("Array after deletion");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

}