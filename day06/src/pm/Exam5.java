package pm;

public class Exam5 {
	public static void main(String[] args) {
		//메서드 오버로딩 Method Overloading
		//하나의 메서드명으로 인수의 개수와 형태에 따라 동작을 다르게함
		print();
		print(3);
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
}
