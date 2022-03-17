package pm;

class OverException extends Exception{
}
class MinusException extends Exception{
}
public class Quiz1 {
	public static void main(String[] args) {
		Quiz1 aa = new Quiz1();
		
		aa.checkScore(85);
		aa.checkScore(110);
		aa.checkScore(-50);
		
	}
	
	void checkScore(int score) {
		try {
			if(score >100) throw new OverException();
			else if(score<0) throw new MinusException();
			else {
				System.out.println("정상적인 값입니다.");
			}
		} catch(OverException e) {
			System.out.println("예외 발생 : 100점 초과");
		} catch(MinusException e) {
			System.out.println("예외 발생 : 음수 값 입력");
		}
	}
}
