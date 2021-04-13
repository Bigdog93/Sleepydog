package sec06.ch07;

public class SamsungTv extends Tv{

	@Override
	public void volumeUp() {
		volume += 2;
	}

	@Override
	public void volumeDown() {
		volume -= 2;
	}

	@Override
	public void chkVolume() {
		System.out.println("현재 볼륨 : " + volume);
	}

}
