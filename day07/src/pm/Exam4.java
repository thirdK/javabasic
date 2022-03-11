package pm;

public class Exam4 {
	public static void main(String[] args) {
		//생성자가 this()를 사용하는 이유
		//생성자의 역할은 필드의 초기화
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println();
		
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		
		b1.print();
		b2.print();
		b3.print();
		
	}
}

class A{
	int m1, m2, m3, m4;
	public A() {
		this.m1 = 1;
		this.m2 = 2;
		this.m3 = 3;
		this.m4 = 4;
	}
	A(int a){
		this.m1 = a;
		this.m2 = 2;
		this.m3 = 3;
		this.m4 = 4;
	}
	
	A(int a, int b){
		this.m1 = a;
		this.m2 = b;
		this.m3 = 3;
		this.m4 = 4;
	}
	
	void print(){
		System.out.print(m1+ " ");
		System.out.print(m2+ " ");
		System.out.print(m3+ " ");
		System.out.println(m4+ " ");
	}
}

class B{
	int m1, m2, m3, m4;
	public B() {
		this.m1 = 1;
		this.m2 = 2;
		this.m3 = 3;
		this.m4 = 4;
	}
	B(int a){
		this();
		this.m1 = a;
	}
	
	B(int a, int b){
		this(a);
		this.m2 = b;
	}
	
	void print(){
		System.out.print(m1+ " ");
		System.out.print(m2+ " ");
		System.out.print(m3+ " ");
		System.out.println(m4+ " ");
	}
}
