package pm;

public class Exam4_2 {
	public static void main(String[] args) {
		//메서드
		//메서드는 클래스의 기능에 해당하는 요소다.
		//사람 클래스라면 먹기, 잠자기, 공부하기...
		//자동차 클래스라면 앞으로가기, 후진하기, 유턴하기...
		//메서드명은 일반적으로 소문자로만 만든다.
		
		//제어자 반환타입 매서드명(인수) {
		//}
		
		//public static int sum(int a, int b){
		//}
		
		//메서드 호출
		//메서드를 사용하려면 먼저 객체를 생성해야 한다.
		
		C c = new C();
		c.print();
		int k = c.data();
		System.out.println(k);
	}
}

class C{
	void print() {
		System.out.println("안녕");
	}
	
	int data() {
		return 3;
	}
}
