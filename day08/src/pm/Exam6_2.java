package pm;

public class Exam6_2 {
	public static void main(String[] args) {
		
	}
}


class P {
	void print1() {
		System.out.println("P클래스 print 1 ");
	}
	void print2() {
		System.out.println("P클래스 print 2 ");
	}
}

class O extends P {
	@Override	//어노테이션 -> 컴퓨터도 읽는 주석 (강제성이 있음)
	void print1() {
		System.out.println("O클래스 print 1 ");
	}
	void print2(int a) {
		System.out.println("O클래스 print 2 ");
	}
}