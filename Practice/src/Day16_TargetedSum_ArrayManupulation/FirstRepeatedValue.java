package Day16_TargetedSum_ArrayManupulation;

import java.util.Scanner;

public class FirstRepeatedValue {

	static int firstRepeatingNumber(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) { // first no
			for (int j = i + 1; j < n; j++) { // second no
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
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
		System.out.println(" Repeating  value in array is ::" + firstRepeatingNumber(arr));
	}
}
