package DSA;

import java.util.Scanner;

public class ReverseNoPrint {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n::");
	int n = sc.nextInt();
	int sum = 1;
//	for(int num = 1 ; num>=n ; n--) {
		for(int num = n ; num>=1 ; num--) {

		System.out.println(num);
	}
}
}
