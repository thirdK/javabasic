package pm;

import java.awt.print.Printable;

import am.A;

public class D extends A{
	
	public void print() {
		System.out.println(a);//자식 클래스는 다른 패키지에 있어도 객체 생성 없이
		System.out.println(b);//protected접근 지정자 까지 접근 가능하다.
	}
	
	public static void main(String[] args) {
		
	}

}
