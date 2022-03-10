package pm;

public class Exam7_4 {
	public static void main(String[] args) {
		//this() 메서드
		//this() 메서드는 자신이 속한 클래스 내부의 다른 생성자를 호출할 때 사용한다.
		
		T t1 = new T();
		System.out.println();
		T t2 = new T(3);
	}
	
}

class T {
	T(){
		System.out.println("첫번째 생성자");
	}
	T(int a){
		this();
		System.out.println("두번째 생성자");
	}
}