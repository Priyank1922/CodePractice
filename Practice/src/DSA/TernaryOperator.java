package DSA;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no::");
		int num = sc.nextInt();

		String ans = (num % 2 == 0) ? "Even" : "odd";
		System.out.println(ans);
	}
}