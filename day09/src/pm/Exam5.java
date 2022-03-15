package pm;

public class Exam5 {
	public static void main(String[] args) {
		//final 메서드와 final class
		/*
		final 변수는 변수가 저장된 값이 최종값의 의미를 가진것처럼 final메서드와 final클래스도
		각각 최종 메서드 최종 클래스의 의미를 갖는다.
		
		최종 메서드의 의미는 상속할 때 부모의 메서드를 오버라이딩하면 자식 클래스에서는
		메서드의 기능이 변경된다. final메서드는 메서드의 기능을 변경할 수 없는 메서드
		즉, 메서드를 final로 선언하면 자식 클래스에서 해당 매서드를 오버라이딩 할 수 없다. 
		
		final로 선언한 클래스는 상속할 수 없다.
		
		class A {
			void abc() {}
			final void bcd() {}
		}
		
		class B extends A {
			void abc() {} //오버라이딩 가능
			void bcd() {} //에러 -> final메소드는 오버라이딩 불가능 
		}
		
		*/
		
	}
}
