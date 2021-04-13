package sec06.ch07;

public class LGTv extends Tv{

	@Override
	public void volumeUp() {
		volume++;
	}

	@Override
	public void volumeDown() {
		volume--;
	}

	@Override
	public void chkVolume() {
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void welcome() {
		System.out.println("LG Welcome!!");
	}

}
