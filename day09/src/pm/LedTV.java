package pm;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끈다.");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조절한다. -> " + volume);

	}

	@Override
	public void chageChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 변경한다. -> " + channel);
	}

}
