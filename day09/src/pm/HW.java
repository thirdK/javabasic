package pm;

import java.util.Random;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		//4-30
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int cnt = 6;
		int target = rand.nextInt(100);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		
		while(true) {
			System.out.print("남은 횟수 "+cnt + "회, 어떤 숫자일까? : ");
			int ans = sc.nextInt();
			if(target == ans) {
				System.out.println(6-cnt + "회만에 맞추었습니다.");
				break;
			}else if(cnt==1) {
				System.out.println("실패 정답은 " + target + "입니다.");
				break;
			}
			else if(target > ans) {
				System.out.println("더 큰 숫자입니다.");
			}else {
				System.out.println("더 작은 숫자입니다.");
			}
			cnt--;
		}
		
		//6-1
		double[] a = new double[5];
		
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] = %.1f\n", i, a[i]);
		}
		
		//6-2
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 5-i;
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
		//6-3
		double[] arr2 = new double[5];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (i+1)*1.1;
			System.out.printf("arr2[%d] = %.1f\n", i, arr2[i]);
		}
		
		//6-6
		System.out.print("요소 수 :");
		int len = sc.nextInt();
		String[] arr3 = new String[len];
		
		for(int i=0; i<len; i++) {
			System.out.printf("arr[%d] = ", i);
			arr3[i] = sc.next();
		}
		
		String str = "arr3 = {" + String.join(", ", arr3) + "}"; 
		
		System.out.println(str);
		
		
	}
}

















