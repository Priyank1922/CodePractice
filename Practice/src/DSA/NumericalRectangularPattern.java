package DSA;

import java.util.Scanner;

public class NumericalRectangularPattern {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row:::");
		int r = sc.nextInt();

		for (int i = 1; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}