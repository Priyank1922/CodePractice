package Method_Function;

class Algebraa {
	int a;
	int b;

//	Algebra() {
//
//	}
	Algebraa(int x, int y) {
		System.out.println("Constructor is called:::");
		a = x;
		b = y;
	}

	int add() {
		int ans = a + b;
		return ans;
	}

	int sub() {
		int ans = a - b;
		return ans;
	}

	int mul() {
		int ans = a * b;
		return ans;
	}
}

public class Constructor_Call {
	public static void main(String[] args) {
		Algebraa obj = new Algebraa(5, 7);

		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.mul());

		Algebraa obj2 = new Algebraa(10, 2);
		System.out.println(obj2.add());
		System.out.println(obj2.sub());
		System.out.println(obj2.mul());

	}
}
