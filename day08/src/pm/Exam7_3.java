package pm;

class SuperA{
	public SuperA() {
		System.out.println("A생성자");
	}
}

class SuperB extends SuperA{
	public SuperB() {
		super();
		System.out.println("B생성자");
	}
}

class SuperC {
	public SuperC(int a) {
		System.out.println("C생성자");
	}
}

class SuperD extends SuperC{
	//자바가 자동으로 추가
	//SuperD(){
	//	super();
	//}
	
	SuperD(){
		super(3);
	}
}

public class Exam7_3 {
	public static void main(String[] args) {
		SuperA sa = new SuperA();
		System.out.println();
		SuperB sb = new SuperB();
		System.out.println();
		SuperC sc = new SuperC(3);
		System.out.println();
		SuperD sd = new SuperD();
	}
}





















