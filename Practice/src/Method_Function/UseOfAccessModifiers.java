package Method_Function;

public class UseOfAccessModifiers {
	public String str_1 = "I am a public member";

	void printFromClass() {
		System.out.println("Within class::" + str_1);
	}

	public static void main(String[] args) {
		UseOfAccessModifiers obj = new UseOfAccessModifiers();
		obj.printFromClass();
		System.out.println("Within class::" + obj.str_1);

		UseOfAccessModifiers2 obj2 = new UseOfAccessModifiers2();
		obj2.printFromOutsideClass();
	}
}

class UseOfAccessModifiers2 {
	void printFromOutsideClass() {
		UseOfAccessModifiers obj2 = new UseOfAccessModifiers();
		System.out.println("Within package but outside the class::::" + obj2.str_1);
	}
}