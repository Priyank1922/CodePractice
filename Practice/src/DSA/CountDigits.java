package DSA;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no::");
		int n = sc.nextInt();
		int NumOfDigit = 0;
		int original_n = n;

		while (n > 0) {
			n = n / 10;
			NumOfDigit++;
		}
		System.out.println("Num of digit in ::" + original_n + " = " + NumOfDigit);
	}
}
