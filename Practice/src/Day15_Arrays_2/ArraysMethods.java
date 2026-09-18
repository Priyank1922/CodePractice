package Day15_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;

		System.out.println("Original array::");
		printArray(arr);

		// trying to copy arr to arr2
		int[] arr2 = arr.clone();

//		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, arr.length - 1);
//		int[] arr3 = Arrays.copyOf(arr, arr.length - 2); 
		System.out.println("Using CopyOf::::");
		printArray(arr3);

//		int [] arr4 = Arrays.copyOfRange(arr, 0, arr.length);
		int[] arr4 = Arrays.copyOfRange(arr, 1, 4);
		System.out.println("Using copyOfRange::::");
		printArray(arr4);

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
