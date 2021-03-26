package sec06.ch04;

public class IfMission {
	public static void main(String[] args) {
		int score = 79;
		
		if(score < 70) {
			System.out.println("Class : D");
		} else if(score < 80) {
			System.out.println("Class : C");
		} else if(score < 90) {
			System.out.println("Class : B");
		} else {
			System.out.println("Class : A");
		}
	}
}
