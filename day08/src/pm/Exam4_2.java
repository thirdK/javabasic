package pm;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Exam4_2 {
	public static void main(String[] args) {
		//객체의 다형적 표현
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
//		B b1 = new A(); <- 자식클래스형태의 참조변수로는 부모클래스의 인스턴스를 참조할 수 없다.
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
//		C c1 = new A();
//		C c2 = new B();
		C c3 = new C();
//		C c4 = new D();
		
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
		D d4 = new D();
	}
}
