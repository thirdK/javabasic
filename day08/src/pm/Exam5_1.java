package pm;

public class Exam5_1 {
	public static void main(String[] args) {
		//메서드 오버라이딩 method overriding
		//메서드 덮어쓰기
		//부모 클래스에게 상속 받은 메서드와 동일한 이름의 메서드를 재 정의하는 것
		//1. 부모 클래스의 메서드와 타입과 갯수가 동일해야 한다.
		//2. 부모 클래스의 메서드보다 접근 지정자의 범위가 같거나 넓어야 한다.
		
		/*
		 class A{
		 	void print(){
		 		System.out.println("A클래스");
		 	}
		 }
		 class B extends A{
		 	void print(){
		 		System.out.println("B클래스");
		 	}
		 }	
		 
		 오버라이딩을 덮어쓰기라고 표현은 했지만 사실 차이가 있다.
		 덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념이지만
		 오버라이딩은 이전 print() 매서드 위에 새로운 매서드가 올라타는 개념이다.
		 사실은 부모의 print()메서드를 강제로 호출할 수도 있다.
		 */
		
		Q q = new Q();
		q.print();
		
		W w = new W();
		w.print();
		
		Q qw = new W();
		qw.print();
		
//		Animal bird = new Bird();
//		Animal cat = new Cat();
//		
//		Animal[] a = new Animal[10];
//		a[0] = bird;
//		a[1] = cat;
		
		//위와 같이 다형성을 이용하면 하나의 타입 배열에 여러 타입을 넣을 수 있다.
	}
}

//class Animal {
//	void cry() {}
//}
//class Bird extends Animal {
//	void cry() {
//		System.out.println("짹짹");
//	}
//}
//class Cat extends Animal{
//	void cry() {
//		System.out.println("야옹");
//	}
//}


class Q {
	void print() {
		System.out.println("Q클래스");
	}
}

class W extends Q {
	void print() {
		System.out.println("W클래스");
	}
}