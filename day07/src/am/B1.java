package am;

public class B1 {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
//		System.out.println(a.d); d는 접근제어자 private
		a.print();
	}
}
