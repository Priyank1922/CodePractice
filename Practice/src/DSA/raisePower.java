package DSA;

import java.util.Scanner;

public class raisePower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no::");
		int a = sc.nextInt();
		System.out.println("Enter power raise to::");
		int b = sc.nextInt();

		int ans = 1;
		for (int i = 1; i <= b; i++) {
//			ans = ans * a;
			ans *= a;
			System.out.println("Ans is :" + ans);
		}
	}
}
