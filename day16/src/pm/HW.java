package pm;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//7-23
		System.out.print("요소의 수 : ");
		int[] arr1 = new int[sc.nextInt()];

		for(int i=0; i<arr1.length; i++) {
			System.out.printf("arr1[%d] : ", i);
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("탐색할 값 : ");
		int[] r1 = arraySrchIdx(arr1, sc.nextInt());
		System.out.println("일치하는 요소의 인덱스");
		for(int i : r1) {
			System.out.println(i);
		}
		System.out.println();
		
		//7-24
		System.out.print("요소 수 : ");
		int[] arr2 = new int[sc.nextInt()];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("arr2[%d] : ", i);
			arr2[i] = sc.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스 : ");
		int[] r2 = arrayRmvOf(arr2, sc.nextInt());
		
		for(int i=0; i<r2.length; i++) {
			System.out.printf("r2[%d] = %d\n", i, r2[i]);
		}
		System.out.println();
		
		//7-25
		System.out.print("요소 수 : ");
		int[] arr3 = new int[sc.nextInt()];
		
		for(int i=0; i<arr3.length; i++) {
			System.out.printf("arr3[%d] : ", i);
			arr3[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스 : ");
		int idx3 = sc.nextInt();
		System.out.print("삭제할 요소의 개수 : ");
		int n3 = sc.nextInt();
		int[] r3 = arrayRmvOfN(arr3, idx3, n3);
		
		for(int i=0; i<r3.length; i++) {
			System.out.printf("r3[%d] = %d\n", i ,r3[i]);
		}
		
		System.out.println();
		
		//7-26
		System.out.print("요소 수 : ");
		int[] arr4 = new int[sc.nextInt()];
		
		for(int i=0; i<arr4.length; i++) {
			System.out.printf("arr4[%d] : ", i);
			arr4[i] = sc.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스 : ");
		int idx4 = sc.nextInt();
		System.out.print("삭제할 요소의 개수 : ");
		int n4 = sc.nextInt();
		int[] r4 = arrayInsOf(arr4, idx4, n4);
		
		for(int i=0; i<r4.length; i++) {
			System.out.printf("r4[%d] = %d\n", i ,r4[i]);
		}
		
		System.out.println();
		
		//7-27
		int[][] x = {{1,2,3},{4,5,6}};
		int[][] y = {{6,3,4},{5,1,2,3}};
		int[][] z = new int[2][3];
		
		if(addMatrix(x,y,z)) {
			System.out.println("행렬a");
			print(x);
			System.out.println("행렬b");
			print(y);
			System.out.println("행렬c");
			print(z);
		}else {
			System.out.println("배열의 크기가 같지 않습니다.");
		}

	}
	
	
	static int[] arraySrchIdx(int[] a, int target) {
		int[] result;
		String tmp = "";
		int len = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == target) {
				tmp += i + " ";
				len++;
			}
		}
		result = new int[len];
		int idx = 0;
		for(String i : tmp.split(" ")) {
			result[idx++] = Integer.parseInt(i);
		}
		
		return result;
	}
	
	static int[] arrayRmvOf(int[] a , int idx) {
		int[] result = new int[a.length-1];
		
		for(int i=0, j=0; i<result.length; i++, j++) {
			if(j == idx) j++;
			result[i] = a[j];
		}
		
		return result;
	}
	
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		int[] result = new int[a.length-n];
		
		for(int i=0, j=0; i<result.length; i++, j++) {
			if(j == idx) j += n;
			result[i] = a[j];
		}
		
		return result;
	}
	
	static int[] arrayInsOf(int[] a, int idx, int n) {
		int[] result = new int[a.length+1];
		
		for(int i=0, j=0; i<result.length; i++, j++) {
			if(i == idx) result[i++] = n;
			result[i] = a[j];
		}
		
		return result;
	}
	
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if(x.length != y.length || x.length != z.length) return false;
		
		for(int i=0; i<x.length; i++) {
			if(x[i].length != y[i].length || x[i].length != z[i].length) return false;
			
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return true;
	}
	
	static void print(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}




























