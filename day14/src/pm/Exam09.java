package pm;

public class Exam09 {
	public static void main(String[] args) {
		Runnable videoRunnable = new VideoThread2();
		Thread thread1 = new Thread(videoRunnable);
		
		Runnable audioRunnable = new AudioThread2();
		Thread thread2 = new Thread(audioRunnable);
		
		thread1.start();
		thread2.start();
	}
}


class VideoThread2 implements Runnable{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("비디오프레임 " + a);
			try {Thread.sleep(200);}
			catch(InterruptedException e) {}
		}
	}
}

class AudioThread2 implements Runnable{
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "삼", "넷", "오"};
		try {Thread.sleep(10);}
		catch (InterruptedException e) {}
		
		for(String b : strArray) {
			System.out.println(" - 자막번호 " + b);
			try {Thread.sleep(200);}
			catch (InterruptedException e) {}
		}
	}
}