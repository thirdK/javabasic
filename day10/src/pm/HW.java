package pm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//6-8
		System.out.print("요소수 : ");
		int numE = sc.nextInt();
		int[] a = new int[numE];
		
		for(int i=0; i<numE; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		System.out.print("찾을 숫자 : ");
		int target = sc.nextInt();
		
		for(int i=0; i<numE; i++) {
			if(a[i] == target) {
				System.out.printf("그 값은 a[%d]에 있습니다.\n", i);
				break;
			}
		}
		
		//6-11
		Random random = new Random();
		System.out.print("요소수 : ");
		numE = sc.nextInt();
		a = new int[numE];
		
		for(int i=0; i<numE; i++) {
			a[i] = random.nextInt(10)+1;
			
			if (i==0) continue;
			while(a[i-1] == a[i]) {
				a[i] = random.nextInt(10)+1;;
			}
		}
		
		for(int i=0; i<numE; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		//6-12
		System.out.print("요소수 : ");
		numE = sc.nextInt();
		a = new int[numE];
		
		for(int i=0; i<numE; i++) {
			int rnd = random.nextInt(10)+1; 
			
			while(Arrays.toString(a).contains(Integer.toString(rnd))) {
				rnd = random.nextInt(10)+1;;
			}
			a[i] = rnd; 
			
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		//6-13
		System.out.print("요소수 : ");
		numE = sc.nextInt();
		a = new int[numE];
		
		for(int i=0; i<numE; i++) {
			int rnd = random.nextInt(100)+1; 
			
			while(Arrays.toString(a).contains(Integer.toString(rnd))) {
				rnd = random.nextInt(100)+1;;
			}
			a[i] = rnd; 
			
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		System.out.println("요소를 섞었습니다.");
		
		for(int i=0; i<10; i++) {
			int idx1 = random.nextInt(numE);
			int idx2 = random.nextInt(numE);
			int tmp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = tmp;
		}
		
		for(int i=0; i<numE; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		
		//6-14
		System.out.print("요소수 : ");
		numE = sc.nextInt();
		a = new int[numE];
		int[] b = new int[numE];
		
		for(int i=0; i<numE; i++) {
			int rnd = random.nextInt(100)+1; 
			
			while(Arrays.toString(a).contains(Integer.toString(rnd))) {
				rnd = random.nextInt(100)+1;;
			}
			a[i] = rnd; 
			
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		for(int i=0; i<numE; i++) {
			b[i] = a[numE-i-1];
		}
		
		System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
		
		for(int i=0; i<numE; i++) {
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
		
	}
}	















