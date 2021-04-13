package sec06.ch07.starcraft;

public class StarcraftMain {
	public static void main(String[] args) {
		Medic medic = new Medic();
		Medic medic2 = new Medic();
		Marine m1 = new Marine();
		Tank t1 = new Tank();
		
		medic.showHP();
		medic2.showHP();
		m1.showHP();
		t1.showHP();
		
		medic.heal(m1);
		medic.heal(medic2);
		medic.heal(t1);
		
		medic.showHP();
		medic2.showHP();
		m1.showHP();
		t1.showHP();
	}
}
