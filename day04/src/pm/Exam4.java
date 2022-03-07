package pm;

public class Exam4 {
	public static void main(String[] args) {
/*
		배열 동일한 자료형을 묶어 저장하는 참조형 자료형이다. 
		최초 생성시 지정한 크기를 절대 변경할 수 없는 특징이 있다.
			 
		1. 배열 선언 - 자료형[] 변수명;
			int[] a;
			배열을 선언하게 되면 메모리에 변수의 공간만 생성되고 공간 안은 비운채로 일단 둔다.
			
		2. 배열 객체 생성
			new int[3];
			
		3. 배열 자료형 변수에 객체 넣기
			int[] a = new int[3];
			int 배열 자료형의 변수명 a 참조변수에 새로운 int자료형 3개를 저장한다.
*/	
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		//배열 객체에 값 넣기
		int[] a = new int[3];
		//배열을 선엄함과 동시에 객체를 생성하여 초기화 -> 기본값은 0
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//배열 객체 생성과 함께 값 넣기
		int[] b = new int[] {3,4,5};
		int[] c;
		c = new int[] {3,4,5};
		
		//아래와 같이 간소화 가능
		int[] d = {3,4,5};
//		int[]d;
//		d = {3,4,5}; 불가능함 new를 생략하려면 선언과 동시에 초기화해야함
		
		
	}
}





























