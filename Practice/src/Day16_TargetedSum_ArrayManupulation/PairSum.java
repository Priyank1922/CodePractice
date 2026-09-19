package Day16_TargetedSum_ArrayManupulation;

import java.util.Scanner;

public class PairSum {

	static int pairSum(int arr[], int target) {
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < n; i++) { // first no
			for (int j = i; j < n; j++) { // second no
				if (arr[i] + arr[j] == target) {
					ans++;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:::");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter " + n + "element::");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target:::");
		int target = sc.nextInt();

		System.out.println(pairSum(arr, target));
		sc.close();
	}
}
