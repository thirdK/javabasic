package pm;

public class Exam7_2 {
	public static void main(String[] args) {
		// this 키워드
		// 모든 메서드에는 자신이 포함된 클래스의 객체를 가리키는 this가 있다.

		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);
	}
}

class Z {
	int m;
	int n;

	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}

	void work() {
		this.init(2, 3);
	}
}
