package pm;

public class Exam7 {
	public static void main(String[] args) {
		// 생성자 constructor
		// 객체를 최초 생성할 때 자동으로 호출되어 실행된다.
		// 1. 생성자는 반드시 클래스 명과 동일한 이름이어야 한다.
		// 2. 생성자는 return이 없다.

		// 생성자를 만들지 않으면 자동으로 기본생성자를 생성해준다.

		A1 a = new A1();
		B1 b = new B1();

		a.work();
		b.work();
	}
}

class A1 {
	int m;

	void work() {
		System.out.println(m);
	}
}

class B1 {
	public B1() {
	}

	int m;

	void work() {
		System.out.println(m);
	}
}
