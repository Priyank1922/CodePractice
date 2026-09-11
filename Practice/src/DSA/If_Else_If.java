package DSA;

import java.util.Scanner;

public class If_Else_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age::");
		int age = sc.nextInt();

		if (age <= 12) {
			System.out.println("Children");
		} else if (age > 12 && age < 18) {
			System.out.println("Teenager");
		} else {
			System.out.println("Adult");
		}
	}
}