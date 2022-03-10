package pm;

public class Exam6 {
	public static void main(String[] args) {
		//가변길이 메서드
		sum();
		sum(1);
		sum(1,2);
		sum(1,2,3);
		
		method2("안녕");
		method2("안녕", "방가");
		method2("안녕", "방가", "감사");
		
	}
	
	public static void sum(int ...a) {
		int result = 0;
		for(int i: a) {
			result += i;
		}
		System.out.println(result);
	}
	
	public static void method2(String ...str) {
		System.out.println("길이 : " + str.length);
		for(String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
	}
}
