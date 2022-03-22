package pm;

public class Exam06 extends Thread{
	/*
	쓰레드 생성 방법
	2가지 방법
	1.	쓰레드를 클래스를 상속받아 run() 메서드를 오버라이딩하는 방법
	2.	1단계 - Runnable 인터페이스를 구현 Runnable 객체를 생성한다.
		2단계 - 쓰레드 객체를 생성할 때 1단계에서 생성한 Runnable 객체를 생성자에 전달해 준다.
	
	사실 2가지 생성방법 모두 run()메서드를 재정의하여 Thread 객체를 생성한다.
	
	쓰레드 실행 방법
	객체를 어떤 방법으로 실행하든 쓰레드 객체 내의 start() 메서드를 호출한다.
	여기서 재정의한 메서드는 run()인데 run()의 내용을 실행하기 위해서는 반드시 start()메서드를 
	호출해야한다는 것을 명심하자.
	주의할 점은 start()메서드로 한번 실행된 쓰레드 객체는 재사용할 수 없다는 것이다. 만약 다시 실행하려면 객체를
	다시 생성해야만 한다.
	
	1. 쓰레드 클래스를 상속 받아서 run()메서드를 오버라이딩
		- 클래스를 정의
			public class Exam6 extends Thread
		- 객체를 생성
		- 쓰레드 실행
	
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] strArray = {"하나", "둘", "삼", "넷", "오"};
		try {Thread.sleep(10);}
		catch (InterruptedException e) {}
		
		for(String b : strArray) {
			System.out.println(" - 자막번호 " + b);
			try {Thread.sleep(200);}
			catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		//객체 생성 및 시작
		Thread smiFileThread = new Exam06();
		smiFileThread.start();
		
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("비디오프레임 " + a);
			try {Thread.sleep(200);}
			catch(InterruptedException e) {}
		}
	}
}
/*
이전에 단일 쓰레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티 쓰레드로 변경하였다.
출력하고자 하는 작업은 비디오 프레임의 번호와 자막의 동시 출력이다.
프로그램이 처음 실행될때 이미 main쓰레드가 실행되고 있으므로 이 2개의 작업을 동시에 실행하기 위해서는 적어도 
하나 이상의 쓰레드를 추가로 생성하여 실행해야 한다.

Thread클래스를 상속받아서 클래스를 정의했고 객체를 생성하여 start()메서드로 실행하였다.
main 쓰레드와 smiFileThread를 사용하여 각각 비디오 번호와 자막번호를 출력했다.
참고로 멀티 쓰레드는 독립적으로 실행되기 때문에 먼저 start()메서드로 호출이 되었다 하더라도
나중에 실행된 쓰레드 보다 늦게 실행될 수 있다.
이런 이유로 자막 번호가 항상 비디오 번호 뒤에 나오도록  쓰레드에 Thread.sleep(10)을 추가해서
0.01초 늦게 출력되도록 했다.
 */

















