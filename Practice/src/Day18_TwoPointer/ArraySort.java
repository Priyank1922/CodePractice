package Day18_TwoPointer;

import java.util.Scanner;

public class ArraySort {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void SortZeroes_and_Ones(int[] arr) {
		int n = arr.length;
		int zeroes = 0;
		// count no of zeroes::
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				zeroes++;
			}
		}

		// 0 to zeroes-1 , zeroes to n-1 : 1
		for (int i = 0; i < n; i++) {
			if (i < zeroes) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:::");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter " + n + "element::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("original array::");
		printArray(arr);

		SortZeroes_and_Ones(arr);
		System.out.println("SORTED ARRAY:::: ");
		printArray(arr);
		sc.close();
	}
}
