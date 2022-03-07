package pm;

import java.util.Arrays;

public class Exam5 {
	public static void main(String[] args) {
		//배열에서의 기본값
		//정수 -> 0
		//실수 -> 0.0
		//문자 -> \n0000
		//boolean -> false;
		//String을 포함한 클래스 참조형 -> null
		
//		char[] c = new char[3];
//		String[] str = new String[3];
//		System.out.println('a');
//		System.out.println(str[0]);
//		System.out.println(c[0]);
		
		boolean[] arr1 = new boolean[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(boolean i:arr1) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
