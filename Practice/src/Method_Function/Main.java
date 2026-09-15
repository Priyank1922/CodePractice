package Method_Function;

import java.util.Scanner;

class Algebra {
	int add(int a, int b) {
		int ans = a + b;
		return ans;
	}
}

public class Main {
	public static void main(String[] args) {
		Algebra obj = new Algebra();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x::");
		int x = sc.nextInt();

		System.out.println("Enter y::::");
		int y = sc.nextInt();

		int result = obj.add(x, y);
		System.out.println("Sum of input number is :::" + result);

	}
}