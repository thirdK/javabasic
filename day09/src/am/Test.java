package am;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};	//문제 배열
		int target = 9;	//목표 숫자
		
		Solution s = new Solution();//Solution클래스의 인스턴스 생성
		s.find(nums, target);	//s객체의 find()메서드 호출, 인자는 (정수형 배열, 정수)
		
		int[] nums2 = {3,2,4};	//2번째 예제
		int target2 = 6;
		s.find(nums2, target2);
		
		int[] nums3 = {3,3};	//3번째 예제
		int target3 = 6;
		s.find(nums3, target3);
	}
}

class Solution{//클래스 정의
	void find(int[] nums, int target) {//find()메서드 정의 매개변수는 (정수배열, 정수)
		System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
		int[] result = new int[2];	//결과를 담을 2칸짜리 정수형 배열 생성
		for(int i=0; i<nums.length-1; i++) {	//반복문으로 배열을 탐색함  j=i+1이므로 i의 탐색범위는 i<nums.length-1
			for(int j=i+1; j<nums.length; j++) {//이중 반복문으로 모든 수를 2개씩 탐색
				if(nums[i]+nums[j] == target) {//두 수의 합이 목표하는 target과 같으면
					result[0] = i;	//각각의 인덱스 번호인 i,j를 결과 배열에 저장함
					result[1] = j;
				}
			}
		}
		//아래는 출력
		System.out.println("Output: " + Arrays.toString(result));
		System.out.printf("Explanation: Because nums[%d] + nums[%d] == %d, we return [%d, %d]\n\n", result[0],result[1],target,result[0],result[1]);
	}
}
