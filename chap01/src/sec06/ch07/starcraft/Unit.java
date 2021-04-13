package sec06.ch07.starcraft;

public abstract class Unit {
	private int currntHP;
	public final int MAX_HP;
	
	Unit(int currntHP, int MAX_HP) {
		this.setCurrntHP(currntHP);
		this.MAX_HP = MAX_HP;
	}
	public int getCurrntHP() {
		return currntHP;
	}
	public void setCurrntHP(int currntHP) {
		this.currntHP = currntHP;
	}
	public void showHP() {
		System.out.println(this + "의 현재 체력 : " + currntHP);
	}
}
