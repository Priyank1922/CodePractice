package DSA;

import java.util.Scanner;

public class ReadCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name::");
		String name = sc.nextLine();
		System.out.println("Name is::" + name);
		char ch = name.charAt(0);
		System.out.println("First character is ::" + ch);

	}
}
