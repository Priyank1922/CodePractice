package Day19_PrefixSumProblems;

import java.util.Scanner;

public class InPlace_PrefixSum {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int[] InPlace_Sum(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array::::");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter " + n + " element::::::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original array:::");
		printArray(arr);

		System.out.println();

		int ans[] = InPlace_Sum(arr);
		System.out.println("Array after inplace prefix sum is ::");
		printArray(ans);
		sc.close();
	}
}
