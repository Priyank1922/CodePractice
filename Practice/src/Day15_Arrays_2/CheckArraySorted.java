package Day15_Arrays_2;

import java.util.Scanner;

public class CheckArraySorted {

	static boolean isSorted(int[] arr) {
		boolean check = true;
//		for(int i = 0 ; i < arr.length ; i++) { // show error bcz i = 0
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				check = false;
				break;
			}
		}
		return check;
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

		System.out.println("Is Sorted::::" + isSorted(arr));
	}
}
