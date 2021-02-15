package main;

public class insertionSort {

	public void printArray(int arr[], String con) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		if (con.equals("newLine")) {
			System.out.println();
		}
	}

	public insertionSort() {
		int[] arr = { 5, 48, 23, 7, 4, 6, 3, 52, 8, 18 };

		// Before Sort
		System.out.println("Before Sort: ");
		printArray(arr, "newLine");

		// Sorting
		System.out.print("\nSorting: ");
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				System.out.println();
				printArray(arr, "");
			}
			System.out.println();
			arr[j + 1] = key;
			printArray(arr, "newLine");
		}

		// After Sort
		System.out.println("\nAfter Sort: ");
		printArray(arr, "newLine");
	}

	public static void main(String[] args) {
		new insertionSort();
	}
}
