package main;

public class bubbleSort {

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public bubbleSort() {
		int[] arr = { 5, 48, 23, 7, 4, 6, 3, 52, 8, 18 };

		// Before Sort
		System.out.println("Before Sort: ");
		printArray(arr);
		System.out.println();

		// Sorting
		System.out.println("Sorting: ");
		
		// Sort dari belakang
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = arr.length - 1; j > 0 + i; j--) {
//				if (arr[j] < arr[j - 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j - 1] = temp;
//				}
//
//				printArray(arr);
//			}
//			System.out.println();
//		}

		// Sort dari depan
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				printArray(arr);
			}
			System.out.println();
		}

		// After Sort
		System.out.println("After Sort: ");
		printArray(arr);
	}

	public static void main(String[] args) {
		new bubbleSort();
	}
}
