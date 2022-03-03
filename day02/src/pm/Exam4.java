package pm;

public class Exam4 {
	public static void main(String[] args) {
		int a=85;
		if(a>=90) {
			System.out.println("A");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=70) {
			System.out.println("C");
		}else if(a>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		int b = 2;
		
		switch(b) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("0");
		}
		a=2;
//		switch(a) {
//		case 10: case 9: case 8: case 7:
//			System.out.println("pass");
//			break;
//		default:
//			System.out.println("fail");
//		}
		
		if(a<11 && a > 6) System.out.println("pass");
		else System.out.println("fail");

		
		b = 88;

		switch(b/10) {
		case 10: case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default:
			System.out.println("F");
		}
		
		
		
		
		
	}
}


























