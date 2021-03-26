package sec06.ch04;

public class IfExam2 {
	public static void main(String[] args) {
		int score = 69;
		
		if(score >= 90) {
			System.out.println("Class : A");
		} else if(score >= 80) {
			System.out.println("Class : B");
		} else if(score >= 70) {
			System.out.println("Class : C");
		} else {
			System.out.println("Class : D");
		}
	}
}
