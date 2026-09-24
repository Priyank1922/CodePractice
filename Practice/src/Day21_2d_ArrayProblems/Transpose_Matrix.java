package Day21_2d_ArrayProblems;

import java.util.Scanner;

public class Transpose_Matrix {
	static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] findTranspose(int[][] matrix, int r, int c) {
		int[][] ans = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				ans[i][j] = matrix[j][i];
			}
		}
		return ans;
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

		System.out.println("Transpose Matrix::::");
		int ans[][] = findTranspose(matrix, r, c);
		printArray(ans);

		sc.close();
	}

}
