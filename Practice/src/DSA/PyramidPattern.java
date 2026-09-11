package DSA;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rowss::::");
		int r = sc.nextInt();

		for (int i = 0; i <= r; i++) { // traversing rowss
//			print r-i space
			for (int j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
//			print 2*i-1
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}