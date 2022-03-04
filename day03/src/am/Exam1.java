package am;

public class Exam1 {
	public static void main(String[] args) {
		//제어문 - 반복문 - while
		//블록 안의 실행 구문을 반복적으로 실행하는 반복 제어문으로 조건을 만족하는동안
		//반복은 지속된다.
//		while(조건){
//			실행구문;
//		}
//		while문과 for문은 언제든지 상호 변환할 수 있다.
		
//		int sum=0, num = 0;
//		while(sum < 100) {
//			sum += num;
//			num++;
//		}
//		System.out.println((num-1) + "까지의 합 = " + sum);
//==========================================================
//		int a=0;
//		while(a<10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//==========================================================		
//		for(int i=0; i<10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//==========================================================	
//		int c=0;
//		while(true) {
//			if(c>10) {
//				break;
//			}
//			System.out.println(c);
//			c++;
//		}
//==========================================================
//		do~while
//		while문과 매우 비슷한 반복 제어문
//		차이점은 do~while의 조건식 판단을 아래에서 하게되어 처음 loop 한번은 조건과 상관없이 실행된다.
		
//		do {
//		실행 구문
//		증감식
//		}while(조건식);
		
//		int a;
//		a=0;
//		
//		while(a<0) { //0번 실행
//			System.out.println(a);
//		}
//		
//		do {
//			System.out.println(a);
//		}while(a<0);
		
		int i=-1;
		while(++i != 3) {
			int j=-1;
			while(++j !=  5) {
				System.out.println(i+ " " + j );
			}
		}
		
		
	}
}






























