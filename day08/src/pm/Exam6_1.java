package pm;

public class Exam6_1 {
	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		
		b.print2();
	}
}

class A1{
	void print1() {
		System.out.println("A클래스 print 1");
	}
	void print2() {
		System.out.println("A클래스 print 2");
	}
}

class B1 extends A1{
	void print1() {
		System.out.println("B클래스 print 1");
	}
	void print2(int a) {
		System.out.println("B클래스 print 2");
	}
}
