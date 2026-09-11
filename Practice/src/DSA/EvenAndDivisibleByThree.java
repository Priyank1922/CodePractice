package DSA;

import java.util.Scanner;

public class EvenAndDivisibleByThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no::");
		int num = sc.nextInt();
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("Ans is::" + num);
		}
	}
}