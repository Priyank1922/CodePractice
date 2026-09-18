package Day15_Arrays_2;

import java.util.Scanner;

public class CountNoOfOccurances {

	static int countOfccurance(int[] arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:::");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter " + n + "element::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter x::");
		int x = sc.nextInt();

		System.out.println("Count of x :::" + countOfccurance(arr, x));
		sc.close();
	}
}
