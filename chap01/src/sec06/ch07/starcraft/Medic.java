package sec06.ch07.starcraft;

public class Medic extends Unit implements Bionic {
	
	Medic() {
		super(3, 15);
	}
	Medic(int currntHP, int MAX_HP) {
		super(currntHP, MAX_HP);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "메딕";
	}
	
	public int getCurrntHP() {
		return getCurrntHP();
	}
	public void setCurrntHP(int currntHP) {
		this.setCurrntHP(currntHP);;
	}
	
	public void heal(Object obj) {
		if(!(obj instanceof Bionic || this == obj)) {
			System.out.println("치료할 수 없습니다.");
		}
		if(obj instanceof Bionic) {
			((Unit)obj).setCurrntHP(MAX_HP);
		}
	}
}
