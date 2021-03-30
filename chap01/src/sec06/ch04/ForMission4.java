package sec06.ch04;

public class ForMission4 {

	public static void main(String[] args) {
		int rand = (int)(Math.random() * 7) + 2;
		System.out.println("rand : " + rand);
		for(int i = 0; i < 9; i++) {
			System.out.println(rand + " * " + (i + 1) + " = " + rand * (i + 1));
		}
	}

}
