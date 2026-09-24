package Day21_2d_ArrayProblems;

import java.util.Scanner;

public class RotateArray {

	static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void reverseArray(int arr[]) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

	static void RotateMatrix(int[][] matrix, int n) {
		// transpose
		InPlaceTranspose(matrix, n, n);
		// reverse
		for (int i = 0; i < n; i++) {
			reverseArray(matrix[i]);
		}
	}

	static void InPlaceTranspose(int[][] matrix, int r, int c) {
		for (int i = 0; i < c; i++) {
			for (int j = i; j < r; j++) {
				// swap matrix [i][j] = matrix[j][i]
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows of matrix:::::");
		int r = sc.nextInt();

		System.out.println("Enter no of colums:::::::");
		int c = sc.nextInt();

		int matrix[][] = new int[r][c];

		int totalElements = r * c;
		System.out.println("Enter " + totalElements + " values");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Input Matrix::::");
		printArray(matrix);

		System.out.println("Rotate Matrix::::");
		RotateMatrix(matrix, r);
		printArray(matrix);

		sc.close();
	}

}
