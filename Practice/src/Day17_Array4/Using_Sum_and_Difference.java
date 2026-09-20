package Day17_Array4;

public class Using_Sum_and_Difference {

	static void swapWithoutTemp(int a, int b) {
		System.out.println("Original value before swap:::");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Values after swap:::");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		swapWithoutTemp(a, b);
	}
}
