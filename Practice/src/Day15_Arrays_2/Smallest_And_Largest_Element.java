package Day15_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_And_Largest_Element {

    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:::");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest element::: " + ans[0]);
        System.out.println("Largest element::: " + ans[1]);

        sc.close();
    }
}
