package OOP;

public class Student {
	int rollno;
	String studentName;

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.rollno = 1;
		obj1.studentName = "Nitesh";
		System.out.println(obj1.rollno);
		System.out.println(obj1.studentName);

		System.out.println("=========================================");

		Student obj2 = new Student();
		obj2.rollno = 2;
		obj2.studentName = "Ritesh";
		System.out.println(obj2.rollno);
		System.out.println(obj2.studentName);
	}
}
