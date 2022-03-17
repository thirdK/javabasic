package pm;

public class Exam7 {
	class FoolException extends RuntimeException{
		//기본생성자 제공
		//상속을 받고 있으므로 자동으로 부모 생성자 호출 super();
	}

	public void sayNick(String nick) {
		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + nick + " 입니다.");
		}catch(FoolException e) {
			System.out.println("FoolException이 발생했습니다.");
		}
		
	}
	
	public void sayNick2(String nick) throws FoolException{
		if("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 " + nick + " 입니다.");
	}
	
	public static void main(String[] args) {
		Exam7 sample = new Exam7();
		
		sample.sayNick("fool");		
		sample.sayNick("genious");	
		//자체적으로 예외처리를 하였으므로 둘다 실행된다.
		
		try {
			sample.sayNick2("fool");	//main()메소드에 예외처리하므로 이곳에서 예외가 발생하면
			sample.sayNick2("genious");//이곳은 실행되지 않는다.
		}catch (FoolException e) {
			System.out.println("FoolException이 발생했습니다.");
		}
		//둘의 차이는 1개가 오류났을때 전체의 실행 여부이다.
	}
}
