package Day17_Array4;

import java.util.Scanner;

public class RotateArray {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int[] rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		int[] ans = new int[n];
		int j = 0;

		for (int i = n - k; i < n; i++) {
			ans[j++] = arr[i];
		}
		for (int i = 0; i < n - k; i++) {
			ans[j++] = arr[i];
			
		}
		return ans;
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
		System.out.println("Enter k::");
		int k = sc.nextInt();

		System.out.println("original array::");
		printArray(arr);

		int ans[] = rotate(arr, k);
		System.out.println("Array after rotation:::");
		printArray(ans);

		sc.close();
	}
}
