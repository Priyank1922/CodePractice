package DSA;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:::");
		int n = sc.nextInt();
		int reversedNum = 0;
		int originalNum = n;

		while (n > 0) {
			reversedNum = reversedNum * 10 + n % 10;
			 n /= 10;

		}
		System.out.println("Reversed ans of " + " " + originalNum + "is = " + reversedNum);
	}
}
