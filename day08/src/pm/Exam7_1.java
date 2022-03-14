package pm;

public class Exam7_1 {
	public static void main(String[] args) {
		/*
		부모 클래스에 init() 메서드가 있고 그 메서드에 500줄의 코드가 있다.
		그런데 자식 클래스는 그 부모 클래스의 기능에다가 어떤 1줄만 추가하고 싶을때
		super가 없다면 자식 클래스에는 부모 클래스의 메서드에 있는 500줄과 1줄을 모두 작성해야한다.
		 */
		
		//모든 생성자의 첫줄에는 반드시 this() 또는 super()가 있어야한다.
		//없으면 자동으로 자바가 삽입한다.
		//즉 상속 관계에 있을때 생성자를 호출하면 항상 부모클래스의 생성자가
		//호출 된다는 것이다. 자식 클래스로 객체를 생성할 때는 부모클래스의
		//객체도 만들어진다.??? 
		// -> 자식클래스의 인스턴스를 생성할 때 당연히 생성자를 호출하게 되는데
		//자식생성자 보다 부모 생성자가 먼저 호출되어 메모리상에 저장되며
		//이후에 자식생성자가 호출되어 메모리에 추가된다.
		
		X x = new X(); //상속 관계에서는 자식클래스의 인스턴스를 생성할 때 부모클래스의 생성자도 실행된다.
	}
}

class V{
	public V() {
		System.out.println("V생성자");
	}
}

class X extends V{
	public X() {
//		super(); 생략을해도 자동으로 부모클래스의 생성자를 호출한다.
		System.out.println("X생성자");
	}
}


class U {
	void init() {
		//500줄
	}
}

class I extends U {
	void init() {
		//500줄
		//화면출력
	}
}

class K extends U {
	void init() {
		super.init(); //500줄 대신 super 사용
		//화면 출력
	}
}
