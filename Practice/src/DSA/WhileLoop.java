package DSA;

import java.util.Scanner;

public class WhileLoop{
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:::");
		int n = sc.nextInt();
		int num = 1;
		while( num <=n){
			System.out.println(num);
			num++;
		}
	 }
}