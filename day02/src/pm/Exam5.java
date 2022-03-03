package pm;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		int mon = 9;

		switch (mon / 3) {
		case 1:
			System.out.println("봄입니다."); break;
		case 2:
			System.out.println("여름입니다.");	 break;
		case 3:
			System.out.println("가을입니다."); break;
		default:
			System.out.println("겨울입니다.");
		}
		
		
		
	}
}
