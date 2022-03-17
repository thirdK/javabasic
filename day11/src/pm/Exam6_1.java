package pm;

public class Exam6_1 {
	public void sayNick(String nick) {
		if("fool".equals(nick)) {
			throw new FoolException();
		}
		
		System.out.println("당신의 별명은 " + nick + " 입니다.");
	}
	
	public static void main(String[] args) {
		Exam6_1 sample = new Exam6_1();
		
		sample.sayNick("fool");	//예외발생
		sample.sayNick("genious");//실행조차 되지 않는다. 예외처리 안해서 프로그램이 종료되기 때문
	}
	
	class FoolException extends RuntimeException{
		
	}
	
}
