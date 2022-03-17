package pm;

public class Exam5 {
	public static void main(String[] args) {
		/*
		예외 던지기
		예외가 발생했을 때 그 위치에서 바로 예외처리를 할 수도 있지만
		호출한 지점으로 예외를 던질수도 있다. throws
		
		예외가 발생하면 2가지 해결책 try-catch를 이용하거나 예외를 던지는 것이다.
		
		예외를 던지는 기본 문법
		
		리턴타입 메서드명() throws 예외 클래스명 {
		}
		
		void abc() {
			try{
				bcd();
			}catch(예외 클래스 타입){
				예외처리
			}
		}
		
		void bcd() throws 예외클래스 타입{
			예외발생을 호출한 지점으로 던지기
		}
		
		Thread.sleep()은 일반 예외가 발생할 수도 있기 때문에 반드시 예외처리를 해야한다.
		
		 */
		
		A a = new A();
		a.abc();
	}
}	
//	class A{
//		void abc() {
//			bcd();
//		}
//		void bcd() {
//			try {
//				System.out.println("Start");
//				Thread.sleep(1000);
//				System.out.println("end");
//			}catch(InterruptedException e) {
//				//예외 처리 구문
//			}
//		}
//	}
	

	
class A{
	void abc() {
		try {
			bcd();
		} catch(InterruptedException e) {
			System.out.println(1);
		}
	}
	void bcd() throws InterruptedException{
		System.out.println("Start");
		Thread.sleep(1000);
		System.out.println("end");
	}
}
