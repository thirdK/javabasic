package am;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
//		out:
//		for (int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				if(i == 3 && j == 2) break out;
//				System.out.println(i + " " + j);
//			}
//		}
//		System.out.println();
//		
//		//레이블 안쓰고 탈출
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 3 && j == 2) {
//					i=100;
//					break;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		out:
		while(true){
			System.out.println("1) 빅맥");
			System.out.println("2) 타코");
			System.out.println("3) 백반");
			System.out.println("0) 종료");
			System.out.print("\n원하는 메뉴를 선택하세요 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: case 2: case 3:
				System.out.printf("선택하신 메뉴는 %d번 입니다.\n", menu);
				continue;
			case 0:
				break out;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}
		
	}
}























