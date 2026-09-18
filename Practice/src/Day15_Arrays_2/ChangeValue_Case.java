package Day15_Arrays_2;

public class ChangeValue_Case {
	static void changeArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void changeVal(int a) {
		a = 100;
	}

	public static void main(String args[]) {
		int a = 1;
		changeVal(a);
		
System.out.print(a);

		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		changeArray(arr);
		printArray(arr);
	}
}
