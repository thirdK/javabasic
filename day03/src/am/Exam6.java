package am;

import java.util.Random;
import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num;
//		do{
//			System.out.print("3자리의 양의 정수(100~999) 입력 >> ");
//			num = sc.nextInt();
//		
//		}while(!(num>=100 && num<=999));
////		}while(num <100 || num > 999);
//		System.out.printf("입력한 값은 %d입니다.", num);
		
		
		Random ran =new Random();
		int rand = 10 + ran.nextInt(90);
		int ans;
		System.out.println("10부터 99사이의 숫자를 맞추세요!");
		System.out.print("어떤 숫자일 까요? : ");
		do {
			ans = sc.nextInt();
			if(ans > rand) {
				System.out.println("더 작은 숫자입니다.");
			}else if(ans < rand) {
				System.out.println("더 큰 숫자입니다.");
			}
		}while(ans != rand);
		System.out.println("정답입니다.");
	}
}
