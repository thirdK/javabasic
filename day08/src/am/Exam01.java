package am;

import java.util.Arrays;

public class Exam01 {
	public static void main(String[] args) {
		//배열, 반복, 조건,
		//주석, 클래스, 객체
		
		int[] a = {1,3,4,5,6};
		
//		for(int i=0; i < a.length; i++) {
//			if(a[i] % 2 == 0) System.out.print(a[i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i:a) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		System.out.println(Arrays.toString(a));
		
//		for(int i=0; i<a.length-1; i++) {
//			System.out.println(a[i] + " " + a[i+1]);
//		}
		
		Test t = new Test();
//		t.ex(a);
		t.ex2(a);
	}
}

class Test{
//	void ex(int[] a) {
//		for(int i=0; i<a.length-1; i++) {
//			System.out.println(a[i] + " " + a[i+1]);
//		}
//	}
	
	void ex2(int[] a) {
		String str = "";
		for(int i=0; i<a.length-1; i++) {
			if((a[i] + a[i+1])%2 == 0) {
				str += i;
				str += i+1;
			}
		}
		int[] result = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			result[i] = str.charAt(i)-'0';
		}
		
		System.out.println(Arrays.toString(result));
	}
}

















