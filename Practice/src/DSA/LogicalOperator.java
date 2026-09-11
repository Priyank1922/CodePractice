package DSA;

public class LogicalOperator {
	public static void main(String[] args) {
		int p = 15;
		int q = 10;
		int r = 5;
//And operator
		System.out.println((p > q) && (q > r));
		System.out.println((p > q) && (q < r));

		// or operator
		System.out.println((p > q) || (q < r));
		System.out.println((p < q) || (r > p));

		// Not Operator
		System.out.println((p == q));
		System.out.println(!(p == q)); 
	}
}
