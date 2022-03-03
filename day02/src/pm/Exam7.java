package pm;

public class Exam7 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=1000; i+=3) {
			sum+=i;
		}
		System.out.println(sum);
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//거꾸로
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		i = 1 2 3 4 5
//		j = 1 2 3 4 
//		j = 0 1 2 3 4
		
		//정삼각형
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int[] scores = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int min = scores[0];
		int max = min;
		int sum1 =0;
		for(int score:scores) {
			sum1 += score;
			
			if(min > score) { 
				min = score;
				continue;
			}else if(max < score) {
				max = score;
			}
		}
		System.out.println("합 >> " + sum1);
		System.out.println("평균 >> " + (double)sum1/scores.length);
		System.out.println("최고점수 >> " + max);
		System.out.println("최소점수 >> " + min);
		
	}
}




















