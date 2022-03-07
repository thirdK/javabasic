package pm;

import java.util.Arrays;

public class Exam7 {
	public static void main(String[] args) {
//		int[] arr1 = new int[100];
//		
//		for(int i=0; i<arr1.length; i++) {
//			arr1[i] =i+1;
//		}
//		
//		for(int i : arr1) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		System.out.println(Arrays.toString(arr1));
		
//		int[] arr1 = {5,4,3,2,1};
//		int[] arr2 = new int[arr1.length];
//		int j=0;
//		for(int i=arr1.length-1; i>=0; i--) {
//			arr2[j++] = arr1[i];
//		}
//		
//		System.out.println(Arrays.toString(arr2));
		
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[arr1.length-1-i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
