package pm;

public class Exam4_3 {
	public static void main(String[] args) {
		//클래스 내부에서 메서드 호출하기
		//클래스 내부에 있는 메서드끼리는 객체를 생성하지 않고도 서로 호출할 수 있다.
		//필드 역시 클래스 내부의 모든 메서드 안에서 객체를 생성하지 않고 사용할 수 있다.
		//조건, 메서드 앞에 static 이 붙어있을 경우만 그냥 호출이 가능하다.
		
		print();
		System.out.println(twice(3));
		System.out.println(sum(twice(3), 5.8));
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k*2;
	}
	
	public static double sum(int m, double n) {
		return m+n;
	}
}
