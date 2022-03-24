package pm;

import java.util.Arrays;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//7-18
		System.out.print("요소 수 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			System.out.printf("a[%d] : ", i);
			arr[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		aryRmv(arr, sc.nextInt());
		for(int i=0; i<len; i++) {
			System.out.printf("a[%d] = %d\n", i, arr[i]);
		}
		
		//7-19
		System.out.print("요소 수 : ");
		int len2 = sc.nextInt();
		int[] arr2 = new int[len2];
		
		for(int i=0; i<len2; i++) {
			System.out.printf("a[%d] : ", i);
			arr2[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		int idx = sc.nextInt();
		System.out.print("삭제할 요소의 수 : ");
		int n = sc.nextInt();
		aryRmv(arr2, idx, n);
		for(int i=0; i<len2; i++) {
			System.out.printf("a[%d] = %d\n", i, arr2[i]);
		}
		
		//7-20
		System.out.print("요소 수 : ");
		int len3 = sc.nextInt();
		int[] arr3 = new int[len3];
		
		for(int i=0; i<len3; i++) {
			System.out.printf("a[%d] : ", i);
			arr3[i] = sc.nextInt();
		}
		
		System.out.print("삽입할 요소의 인덱스 : ");
		int idx3 = sc.nextInt();
		System.out.print("삽입할 값 : ");
		int n3 = sc.nextInt();
		aryIns(arr3, idx3, n3);
		for(int i=0; i<len3; i++) {
			System.out.printf("a[%d] = %d\n", i, arr3[i]);
		}
		
		//7-21
		System.out.print("배열 a의 요소 수 : ");
		int lenA = sc.nextInt();
		int[] arrA = new int[lenA];
		
		for(int i=0; i<lenA; i++) {
			System.out.printf("a[%d] : ", i);
			arrA[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요소 수 : ");
		int lenB = sc.nextInt();
		int[] arrB = new int[lenB];
		
		for(int i=0; i<lenB; i++) {
			System.out.printf("b[%d] : ", i);
			arrB[i] = sc.nextInt();
		}
		
		aryExchng(arrA, arrB);
		
		for(int i=0; i<lenA; i++) {
			System.out.printf("a[%d] = %d\n", i, arrA[i]);
		}
		for(int i=0; i<lenB; i++) {
			System.out.printf("b[%d] = %d\n", i, arrB[i]);
		}
		
		System.out.print("요소 수 : ");
		int lenX = sc.nextInt();
		int[] x = new int[lenX];
		
		for(int i=0; i<lenX; i++) {
			System.out.printf("a[%d] : ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		int[] y = arrayClone(x);
		for(int i=0; i<lenX; i++) {
			System.out.printf("y[%d] = %d\n", i, y[i]);
		}
	}
	
	static void aryRmv(int[] a , int idx) {
		for(int i=idx; i<a.length-1; i++) {
			a[i] = a[i+1];
		}
	}
	
	static void aryRmv(int[] a , int idx, int n) {
		for(int i=idx; i<a.length-1; i++) {
			if(i+n >= a.length) break;
			a[i] = a[i+n];
		}
	}
	
	static void aryIns(int[] a, int idx, int x) {
		for(int i=a.length-1; i>=idx; i--) {
			if(i == idx) {
				a[i] = x;
				break;
			}
			a[i] = a[i-1];
		}
	}
	
	static void aryExchng(int[] a, int[] b) {
		int len = Math.min(a.length, b.length);
		
		for(int i=0; i<len; i++) {
			int tmp = a[i];
			a[i] = b[i];
			b[i] = tmp;
		}
		
	}
	
	static int[] arrayClone(int[] a) {
//		int[] y = Arrays.copyOf(x, a.length);
		int[] y = new int[a.length];
		for(int i=0; i<a.length; i++) {
			y[i] = a[i];
		}
		return y;
	}
}













