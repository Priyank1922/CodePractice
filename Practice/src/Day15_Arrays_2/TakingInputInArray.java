package Day15_Arrays_2;

import java.util.Scanner;

public class TakingInputInArray {

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of array::");
//		int n = sc.nextInt();
		int arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
//		System.out.println("Enter " + n + "elements:::");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		System.out.println("Original array::");
		printArray(arr);

		// trying to copy arr to arr2
		int[] arr2 = arr;
		System.out.println("Copied array::");
		printArray(arr2);

		// changing value of arry2
		arr2[0] = 0;
		arr2[1] = 0;

		System.out.println("Original array after changing value of array2::");
		printArray(arr);

		System.out.println("Copied value after changing value of array2:::");
		printArray(arr2);
	}
}
