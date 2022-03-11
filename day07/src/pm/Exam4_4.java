package pm;

public class Exam4_4 {
	//접근 제어자(지정자) modifier 는 클래스, 필드, 메서드, 생성자 등에게
	//어떤 특징을 부여하는 문법 요소이다. 일종의 형용사로 생각할 수 있다. 멋진 자동차
	//사용 범위를 정의하는 역할을 한다.
	//public	protected		defaulf		private
	
	//public	: 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래스에서 접근 가능
	//protected : 동일 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근 가능
	//default	: 동일 패키지 내의 모든 클래스
	//private	: 동일 클래스에서만 사용가능
	public int a;
	protected int b;
	int c; // default
	private int d;
	
	void abc() { //default
		
	}
	
	public static void main(String[] args) {
		
	}
}
