package DSA;

import java.util.Scanner;

public class DivisibleByThreeOrFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter no::");
		int num = sc.nextInt();

		if (num % 3 == 0 || num % 5 == 0) {
			System.out.println("Ans is ::" + num);
		} else {
			System.out.println("Errror");
		}
	}
}