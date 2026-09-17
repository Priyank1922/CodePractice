package Day13;

class Algebra {
	int a = 12; // member variable (class level scope)
	int b = 14;

	int add() {
		return a + b;
	}

	int add2() {
		int p = 100;
		int q = 200;
		return p - q;
	}

	int sub() {
//	return p-q; //show error 
		return 0;
	}

	void demo_block() {
		int s = 10;
		{
			int t = 10;
			System.out.println(t);
		}
		{
			int t = 20;
			System.out.println(t);
		}
		System.out.println(s);
//		System.out.println(t); //show error because they are block level
	}
}

public class Main {
	public static void main(String[] args) {
		int a = 12;
//		String a;
		Algebra obj = new Algebra();
		obj.demo_block();

	}
}
