package DSA;

public class PrintAllValueExceptMultipleOf3 {
	public static void main(String[] args) {

		
		//using for loop
//		for (int num = 1; num <= 50; num++) {
//			if (num % 3 == 0) {
//				continue;
//			}
//			System.out.println("Value bw 1 to 50 Except multiple of 3 is ::" + num);
//		}
		
		//using while loop
		
		int num = 1;
		while(num<=50) {
			if(num%3==0) {
				num++;
				continue;
			}
			System.out.println("Value bw 1 too 50 except multiple of 3 is::"+num);
			num++;
		}
	}
}
