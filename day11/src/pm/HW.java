package pm;

import java.util.Random;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// 6-15;
		String[] mName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int flag = 0;
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		do {
			int month = random.nextInt(12)+1;
			if(flag == month) continue;
			flag = month;
			while(true) {
				System.out.printf("%d월 : ", month);
				if(sc.nextLine().equals(mName[month-1])) break;
				System.out.println("틀렸습니다.");
			}
			System.out.println("맞았습니다.");
			System.out.print("다시한번? 1...Yes/0...No : ");
		}while(Integer.parseInt(sc.nextLine())==1);

		// 6-18

		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] result = new int[4][4];
		System.out.println("행렬 a의 요소를 입력하세요");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d] : ", i, j);
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("행렬 b의 요소를 입력하세요");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("b[%d][%d] : ", i, j);
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for(int k=0; k <b.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//7-1
		System.out.print("정수 x : ");
		int x = sc.nextInt();
		System.out.printf("signOf(x)는 %d입니다.", signOf(x));
		
		System.out.println();
		
		//7-2
		System.out.print("정수 a1 : ");
		int a1 = sc.nextInt();
		System.out.print("정수 b1 : ");
		int b1 = sc.nextInt();
		System.out.print("정수 c1 : ");
		int c1 = sc.nextInt();
		System.out.printf("최소값은 %d입니다.", min(a1,b1,c1));
	}
	
	static int signOf(int x) {
		if(x == 0) return 0;
		return x>0 ? 1 : -1;
	}
	
	static int min(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}
}
