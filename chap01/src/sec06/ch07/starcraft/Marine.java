package sec06.ch07.starcraft;

public class Marine extends Unit implements Bionic {

//	private int currntHP = 10;
//	public static final int MAX_HP = 20;
	Marine() {
		super(10, 20);
	}
	Marine(int currntHP, int MAX_HP) {
		super(currntHP, MAX_HP);
	}
	
	@Override
	public String toString() {
		return "마린";
	}
	
	public int getCurrntHP() {
		return getCurrntHP();
	}
	public void setCurrntHP(int currntHP) {
		this.setCurrntHP(currntHP);
	}
}
