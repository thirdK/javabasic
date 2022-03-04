package am;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Exam4 {
	public static void main(String[] args) {
		
//		System.out.print("숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		System.out.println("입력하신 숫자는 "+ (num==0 ? "0입니다." : "0이 아닙니다."));
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요 >> ");
		int score = sc.nextInt();
		
		String str;
		
		switch(score/10) {
		case 10: case 9:
			str = "A"; break;
		case 8:
			str = "B"; break;
		case 7:
			str = "C"; break;
		case 6:
			str = "D"; break;
		default:
			str = "F";
			score = 5;
		}
		
		if(score%10 >= 7 || score==100) str += "+";
		else if(score%10 <= 3 && score != 100) str += "-";
		
		System.out.printf("당신의 학점은 %s입니다.", str);
		
	}
}
