package am;

public class Exam2 {
	public static void main(String[] args) {
//		Break 제어 키워드
//		break는 if구문을 제외한 {}를 탈출하는 제어 키워드이다.
//		일반적으로 반복문에서 특정 조건을 만족하는 경우 반복문을
//		탈출하는데 사용된다.

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}

		// 반복문을 전부 나가는 방법 2가지
		System.out.println("=============================================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					i = 100; // i를 초과시킴
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("=============================================");
		Loop1: // 위치 지정 레이블
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					break Loop1;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("=============================================");
//		continue 제어 키워드
//		반복과정에서 특정 구문을 실행하지 않고 건너뛰는 용도로 사용된다.
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=============================================");
		Loop1: // 위치 지정 레이블
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) continue Loop1;
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("=============================================");
		int i = 10;
		while(i > 0) {
			System.out.println(i);
			i -= 2;
		}

	}
}
