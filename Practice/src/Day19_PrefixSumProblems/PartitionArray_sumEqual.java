package Day19_PrefixSumProblems;

import java.util.Scanner;

public class PartitionArray_sumEqual {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int findArraySum(int[] arr) {
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		return totalSum;
	}

	static boolean equalSumPartition(int[] arr) {
		int totalSum = findArraySum(arr);

		int prefSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefSum += arr[i];
			int suffixSum = totalSum - prefSum;
			if (suffixSum == prefSum) {
				return true;
			}
		}
		return false;
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

		System.out.println("Equal partition possible:::" + equalSumPartition(arr));
	}
}
