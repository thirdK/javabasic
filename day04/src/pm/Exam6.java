package pm;

import java.util.Arrays;

public class Exam6 {
	public static void main(String[] args) {
//		배열의 특징
//		먼저 기본 자료형과 참조 자료형에서 변수를 복사할 때를 생각해보자.
//		대입 연산자를 이용해서 변수가 복사되는 과정을 이해해 보자.
//		'변수의 복사'라는 말의 의미는 무엇일까.. 바로 변수에 포함된 메모리 값이다.
//		그런데 기본 자료형과 참조 자료형의 저장되는 메모리 값의 의미가 다르다. 따라서
//		둘 사이에 차이가 발생된다.
		
//		기본 자료형은 메모리에 실제 데이터 값을 저장한다. 따라서 기본 자료형 변수를 복사하면
//		실제 데이터 값이 1개 더 복사된다.
//		이후 복사된 값을 아무리 변경해도 원본 값은 아무런 영향을 받지 않는다.
		
//		참조 자료형은 실제 데이터 값이 아닌 저장된 위치값을 가지고 있다. 
//		따라서 참조 자료형 변수를 복사하면 실제 데이터가 복사되는 것이 아니라
//		실제 데이터의 위치값이 복사된다.
		
//		배열의 길이
//		.length		배열 참조 변수가 가리키는 곳에 배열 객체가 있고 그 배열의 갯수를 가져옴
		
//		int[] a = new int[] {3,4,5,6,7};
//		System.out.println(a.length);
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		for(int i: a) {
//			System.out.println(i);
//		}
		
//		2차원 배열 : 가로와 세로 2차원으로 데이터를 저장하는 배열
//					배열의 선언에서 차원이 1개씩 늘어나면 대괄호가 1개씩 늘어난다.
//					배열의 위치 표현
//		자료형[][] 변수명;		자료형 변수명[][]; 	자료형[] 변수명[];
		
//		int[][] array1 = new int[3][4];
		
//		int[][] array1 = new int[2][3];
//		array1[0][0] = 1;
//		array1[0][1] = 2;
//		array1[0][2] = 3;
//		array1[1][0] = 4;
//		array1[1][1] = 5;
//		array1[1][2] = 6;
		
		int[][] array1 = {{1,2},{3,4,5}};
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
		}
		
		System.out.println();
		
		for(int[] arr : array1) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(Arrays.toString(array1[i]));
		}
		
		
		
		
	}
}





















