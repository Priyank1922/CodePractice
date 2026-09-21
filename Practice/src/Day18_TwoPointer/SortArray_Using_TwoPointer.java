package Day18_TwoPointer;

import java.util.Scanner;

public class SortArray_Using_TwoPointer {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void SortUsing_TwoPointer(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;

		while (left < right) {
			if (arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if (arr[left] == 0) {
				left++;
			}
			if (arr[right] == 1) {
				right--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:::");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " element:::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Origianl array::");
		printArray(arr);

		SortUsing_TwoPointer(arr);
		System.out.println("Array after sort using 2 pointer...");
		printArray(arr);

		sc.close();
	}
}
