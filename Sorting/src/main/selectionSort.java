package main;

public class selectionSort {

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public selectionSort() {
		int[] arr = { 5, 48, 23, 7, 4, 6, 3, 52, 8, 18 };

		// Before Sort
		System.out.println("Before Sort: ");
		printArray(arr);

		// Sorting
		System.out.print("\nSorting: ");
		int low = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			low = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[low] > arr[j]) {
					low = j;
				}
			}

			if (low != i) {
				int temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;

				System.out.println("\nSwap (" + arr[low] + ", " + arr[i] + ") ");
				printArray(arr);
			}
		}

		// After Sort
		System.out.println("\nAfter Sort: ");
		printArray(arr);
	}

	public static void main(String[] args) {
		new selectionSort();
	}
}
