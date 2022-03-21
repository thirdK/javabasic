package pm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW h = new HW();
		
		//7-3
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		System.out.print("정수 c : ");
		int c = sc.nextInt();
		System.out.println("중간값은 " + h.med(a, b, c) + "입니다."); 
		
		System.out.println();
		
		//7-4
		System.out.println("1부터 x까지의 합을 구하자.");
		System.out.print("x의 값 : ");
		int x = sc.nextInt();
		System.out.println("1부터 " + x + "까지의 합은 " + h.sumUp(x) + "입니다.");
		
		System.out.println();
		
		//7-6
		System.out.print("몇 월입니까(1~12) : ");
		int month = sc.nextInt();
		h.printSeason(month);
		
		System.out.println();
		
		//7-7
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 : ");
		int dan = sc.nextInt();
		h.putStart(dan);
		
		System.out.println();
		
		//7-8
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값: ");
		int n1 = sc.nextInt();
		System.out.print("상한값: ");
		int n2 = sc.nextInt();
		System.out.printf("생성한 난수는 %d입니다.\n", h.random(n1, n2));
	}
	
	int med(int a, int b, int c) {
		int[] num = {a,b,c};
		Arrays.sort(num);
		return num[1];
	}
	
	int sumUp(int n) {
		if(n==1) return 1;
		return n + sumUp(n-1);
	}
	
	void printSeason(int m) {
		if(m < 1 || m > 12) return;
		switch(m/3) {
		case 1:
			System.out.println("해당 월의 계절은 봄입니다."); break;
		case 2:
			System.out.println("해당 월의 계절은 여름입니다."); break;
		case 3:
			System.out.println("해당 월의 계절은 가을입니다."); break;
		default:
			System.out.println("해당 월의 계절은 겨울입니다.");
			
		}
	}
	
	void putStart(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	int random(int a, int b) {
		if(b<=a) return a;
		Random rand = new Random();
		
		return rand.nextInt(b-a+1)+a;
	}
}
