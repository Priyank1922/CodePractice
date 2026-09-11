package DSA;

import java.util.Scanner;

public class StreamOfSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:::");
		int num = sc.nextInt();
		int sum = 0;

		// using while loop
//		while (num != -1) {
//			sum += num;
//			num = sc.nextInt();
//		}
//		System.out.println("Ans is:::" + sum);
		// using do-while loop
		do {
			sum += num;
			num = sc.nextInt();
		} while (num != -1);
		System.out.println(sum);
	}
}