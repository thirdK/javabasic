package pm;

import java.util.Arrays;

public class Exam4 {
	public static void main(String[] args) {
//		String - 문자열 자료형, 자바에서 가장 많이 사용되는 자료형
//		int a = 12;
//		String b = "swift";
//		String c = new String("swift");
		
//		String str1 = new String("하이");
//		System.out.println(str1);
//		
//		String str2 = "안녕";
//		System.out.println(str2);
		
//		String 의 특징 
//		1. 한번 정의된 문자열은 변경할 수 없다.
//			만약 문자열의 내용을 변경하면 자바가 기존 문자열을 수정하는 것이 아니라
//			새로운 문자열을 생성하여 사용하게 되는 것이다. 기존의 객체는 버린다.
//		2. 문자열을 입력해서 객체를 생성할때 같은 문자열끼리 객체를 공유한다.
//			이것은 메모리의 효율성 때문이다.
		
//		String str1 = new String("안녕");
//		String str2 = str1;
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		str1 = "안녕하세요";	//문자열은 변경이 불가능하다 즉, 새 문자열을 생성한다. -> 기존 주소를 못쓴다.
//		//여기서 str1이 기존에 갖고 있던 참조값이 바뀐다.
//		//str2는 기존 참조값을 그대로 가지고 있다.
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		int[] arr1 = new int[] {3,4,5};
//		int[] arr2 = arr1;
//		
//		arr1[0] = 6;
//		arr1[1] = 7;
//		arr1[2] = 8;
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str4==str1);
		
		//new로 생성할때는 동일한 문자열 객체가 있든 없든 무조건 새로운 객체를 생성한다.
		//new 를 사용하지 않았을 경우는 이미 생성된 동일 문자열이 있으면 그 객체를 공유한다.
		str1 = null;
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
}























