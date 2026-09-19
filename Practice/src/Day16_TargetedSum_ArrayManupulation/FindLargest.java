package Day16_TargetedSum_ArrayManupulation;

import java.util.Scanner;

public class FindLargest {
	static int findMax(int[] arr) {
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}
		return mx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:::");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter" + "  " + n + "  " + "element::::");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Max value in array is ::" + " " + findMax(arr));
	}
}
