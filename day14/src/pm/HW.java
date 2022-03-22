package pm;

import java.util.Random;
import java.util.Scanner;

public class HW {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 7-9
		while (true) {
			System.out.print("양의 정수값 : ");
			int num = sc.nextInt();
			if (num <= 0) continue;

			System.out.println("반대로 읽으면 " + readPlusInt(num) + "입니다.");
			System.out.print("다시 한 번?<Yes...1/No...0> : ");
			if (sc.nextInt() == 1) continue;
			else break;
		}
		
		System.out.println();
		
		//7-10
		rand();
		
		System.out.println();
		
		//7-15
		System.out.print("요소수 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			System.out.printf("x[%d] : ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("모든 요소의 합은 " + sumOf(arr) + "입니다.");
		
		System.out.println();

		//7-16
		System.out.print("사람 수는 : ");
		int len2 = sc.nextInt();
		int[] arr2 = new int[len2];
		int[] arr3 = new int[len2];
		System.out.println(len2 + "명의 신장과 체중을 입력하자");
		
		for(int i=0; i<len2; i++) {
			System.out.print(i+1 + "번의 신장 :");
			arr2[i] = sc.nextInt();
			System.out.print(i+1 + "번의 체중 :");
			arr3[i] = sc.nextInt();
		}
		System.out.println("키가 가장 작은 사람의 신장 : " + minOf(arr2) + "cm");
		System.out.println("가장 마른 사람의 체중 : " + minOf(arr3) + "kg");
	}
	//7-9
	static int readPlusInt(int num) {

		String str = "";
		while (num != 0) {
			str += Integer.toString(num % 10);
			num /= 10;
		}
		return Integer.parseInt(str);

	}
	//7-10
	static void rand() {
		Random rnd = new Random();
		int result = 0;
		
		String[] k = {"+", "-"};
		
		while(true) {
			int x = rnd.nextInt(900)+100;
			int y = rnd.nextInt(900)+100;
			int z = rnd.nextInt(900)+100;
			String first = k[rnd.nextInt(2)];
			String second = k[rnd.nextInt(2)];
			
			System.out.println("암산 훈련!!");
			
			if(first.equals("+")) result = x+y;
			else result = x-y;
			if(second.equals("+")) result += z;
			else result -= z;
			
			while(true){
				System.out.printf("%d %s %d %s %d = ", x, first, y, second, z);
				
				if(sc.nextInt()!=result) System.out.println("틀렸습니다.");
				else break;
			}
			System.out.print("다시 한 번?<Yes...1/No...0> : ");
			if(sc.nextInt() != 1) break;
		}
	}
	
	//7-15
	static int sumOf(int[] a) {
		int total = 0;
		for(int i : a) {
			total += i;
		}
		
		return total;
	}
	
	//7-16
	static int minOf(int[] a) {
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			min = Math.min(min, a[i]);
		}
		return min;
	}
}



















