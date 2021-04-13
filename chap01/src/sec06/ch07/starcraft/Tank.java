package sec06.ch07.starcraft;

public class Tank extends Unit implements Mechanic {
	
	Tank() {
		super(30, 100);
	}
	Tank(int currntHP, int MAX_HP) {
		super(currntHP, MAX_HP);
	}

//	private int currntHP = 30;
//	public static final int MAX_HP = 100;
	
	@Override
	public String toString() {
		return "탱크";
	}

}
