package Day16_TargetedSum_ArrayManupulation;

import java.util.Scanner;

public class SecondMax {

	static int findMax(int[] arr) {
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}
		return mx;
	}

	static int secondMax(int arr[]) {
		int mx = findMax(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondmx = findMax(arr);

		return secondmx;
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
		System.out.println(" Second max value in array is ::" + secondMax(arr));
	}
}
