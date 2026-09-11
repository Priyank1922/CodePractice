package DSA;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no::");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("Odd");
		}
	}
}
