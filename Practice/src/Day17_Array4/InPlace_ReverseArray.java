package Day17_Array4;

public class InPlace_ReverseArray {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void swapArray(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	static void InplaceReverse(int arr[]) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			swapArray(arr, i, j);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 3, 4, 5 };
		InplaceReverse(arr);
		InplaceReverse(arr2);
		System.out.println("ReverseArray using InPlace::::");
		printArray(arr);
		printArray(arr2); 

	}
}
