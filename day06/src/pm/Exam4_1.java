package pm;

public class Exam4_1 {
	public static void main(String[] args) {
		B b = new B();
		
		b.printFieldValue();
	}
}

class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalValue() {
		int k;
//		System.out.println(k); //지역변수를 초기화 하지 않으면 오류가 발생
	}
}
