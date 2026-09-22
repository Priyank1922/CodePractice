package Day19_PrefixSumProblems;

import java.util.Scanner;

public class OneBasedIndexing_Sum {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int[] Indexing_Sum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array::::");
		int n = sc.nextInt();
		int arr[] = new int[n + 1];

		System.out.println("Enter " + n + " element::::::");
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original array:::");
		printArray(arr);
		System.out.println();

		int Sum[] = Indexing_Sum(arr);
		System.out.print("Enter no of queries::::");
		int q = sc.nextInt();

		while (q-- > 0) {
			System.out.println("Enter range:::");
			int l = sc.nextInt();
			int r = sc.nextInt();

			int ans = Sum[r] - Sum[l - 1];
			System.out.println("Sum is :::" + ans);
		}

		sc.close();
	}
}
