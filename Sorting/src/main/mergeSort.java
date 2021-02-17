package main;

public class mergeSort {

	public void merge(int arr[], int l, int m, int r) {
		int i = l;
		int j = m + 1;
		int k = l;

		int[] temp = new int[arr.length];

		while (i <= m && j <= r) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}

		while (i <= m) {
			temp[k] = arr[i];
			k++;
			i++;
		}

		while (j <= r) {
			temp[k] = arr[j];
			k++;
			j++;
		}

		for (int p = l; p <= r; p++) {
			arr[p] = temp[p];
		}
	}

	public void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			// Divide into smallest unit
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge in order
			merge(arr, l, m, r);
		}
	}

	public mergeSort() {
		int[] arr = { 5, 48, 23, 7, 4, 6, 3, 52, 8, 18 };

		System.out.println("Before: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sort(arr, 0, arr.length - 1);

		System.out.println("\n\nAfter: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		new mergeSort();
	}
}
