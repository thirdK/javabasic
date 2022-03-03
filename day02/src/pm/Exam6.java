package pm;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
//		System.out.println("aa");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("월을 입력하세요 : ");
//		int mon = sc.nextInt();
//		
//		switch(mon) {
//		case 1:
//			System.out.println("Jan"); break;
//		case 2:
//			System.out.println("Feb"); break;
//		case 3:
//			System.out.println("Mar"); break;
//		case 4:
//			System.out.println("Apr"); break;
//		case 5:
//			System.out.println("May"); break;
//		case 6:
//			System.out.println("Jun"); break;
//		case 7:
//			System.out.println("Jul"); break;
//		case 8:
//			System.out.println("Aug"); break;
//		case 9:
//			System.out.println("Sep"); break;
//		case 10:
//			System.out.println("Oct"); break;
//		case 11:
//			System.out.println("Nov"); break;
//		case 12:
//			System.out.println("Dec"); break;
//		}
		
		// 반복문 for
		// 실행 구문을 반복적으로 수행하는 반복 제어문으로 일반적으로 반복 횟수가 정확할 때
		// 주로 사용된다. 즉, for문의 구문을 보면 몇번 반복할지 유추할 수 있어야한다.
		
//		for(start ; stop ; step) {}
		
//		for(int i=0; i<= 10; i++) {
//			System.out.println(i);
//		}
		
		// 2개의 변수를 사용하는 for문
//		for(int i=0, j=0; i<10; i++, j++) {
//			System.out.println(i + ", " + j);
//		}
		
		// for문에서의 무한루프
//		for(int i=0;    ;i++) {
//			System.out.println();
//		}
		
		// for문에서의 무한루프2
//		for(;;) {
//			System.out.println("a");
//		}
		
		//이중 for문
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.println(i + "일차 " + j+"교시");
//			}
//		}
		
//		String name = "홍길동";  // 변수 1개에 데이터 1개 저장
		String[] names = {"홍길동", "이몽룡", "성춘향"};
		int[] numbers = {1,2,3,4,5};
		
		//for each문, 향상 for문
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}































