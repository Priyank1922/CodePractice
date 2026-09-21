package Day18_TwoPointer;

import java.util.Scanner;

public class Square_of_Array {

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

	static void reverse(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}

	}

	static int[] sortSqure(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		int k = 0;
		int[] ans = new int[n];

		while (left <= right) {
			if (Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;
			} else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}

		return ans;
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

		int ans[] = sortSqure(arr);
		System.out.println("Array after square ...");
		reverse(ans);
		printArray(ans);

		sc.close();
	}
}
