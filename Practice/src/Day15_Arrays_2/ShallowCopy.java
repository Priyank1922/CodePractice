package Day15_Arrays_2;

public class ShallowCopy {
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

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		changeArray(arr);
		printArray(arr);
		
		System.out.println("Original array::");
		printArray(arr);

		// trying to copy arr to arr2
		int[] arr2 = arr;
		System.out.println("Copied array::");
		printArray(arr2);

	}
}
