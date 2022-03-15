package pm;

public class Exam4 {
	public static void main(String[] args) {
		//final...필드, 메서드, 클래스 앞에 위치한다. 의미가 각각 다르다.
		//final 변수 : 변수를 선언할때만 지정할 수 있고 한번 대입된 값을 수정할 수 없다.
		//처음 대입한 값이 최종값이 된다. 변수를 상수로 사용할 때 쓴다.
	}
}
/*
class A1{
	int a = 3;
	final int b = 5;
	A(){}
}

class A2 {
	int a;
	final int b;
	A2() {
		a = 3;
		b = 5;
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	A3() {
		a = 7;
		b = 9; //불가능하다 상수에 이미 초기화를 했기 때문
	}
}

class B {
	void bcd() {
		int a=3;
		final int b = 5;
		a=7;
		b=9; //불가능
	}
}
		
 */
