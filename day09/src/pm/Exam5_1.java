package pm;

public class Exam5_1 {
	public static void main(String[] args) {
		/*
		 abstract 추상 - 구체적이지 않다.
		 abstract method - 중괄호가 없는 메서드, -> 메서드의 기능이 없다.
		 					abstract 리턴타입 메서드명();
		 					
		 abstract class -	추상클래스는 abstract를 사용하여 선언함
		 					추상 메서드를 포함하면 반드시 추상클래스로 선언해야함
		 					
		 
		 추상 메서드 사용의 장점
		 
		 일반 클래스 정의 했을때와 추상 클래스로 정의 했을때
		 자식 클래스에서 cry() 메서드를 오버라이딩 하는 과정에서 만약에 오타가 발생됐다고 가정했을때
		 이때 일반 클래스를 상속한 자식 클래스에서는 오버라이딩이 아니라 추가로 새로운 메서드를 정의한 결과가된다.
		 따라서 2개의 메소드가 존재하게 된다. 이런 경우는 객체를 생성하고 cry메서드를 호출해도 아무것도 출력되지 않음
		 즉, 의도치않은 결과가 나타날 수 있다.
		 
		 추상클래스는 위의 경우가 불가능하다
		 자식 클래스가 오버라이딩 하려고하는 과정에서 추상메서드를 구현하지 않으면 오류가 발생된다.
		 추상클래스를 상속받고 구현하지 않으려면 상속받은 클래스도 추상클래스여야 한다.
		 
		 클래스는 추상메서드를 하나라도 포함하고 있으면 추상클래스로 선언해야하기 때문이다. 
		 
		 겨우 오타찾는 정도의 장점이라고 가볍게 볼 수도 있겠지만 여러사람들이나 여러회사들이
		 협업을 하게되는 경우 많은 필요성을 느끼게 될것이다.
		*/
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}
}

abstract class Animal {		//추상클래스
	abstract void cry();	//추상 메서드
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}