package sec06.ch04;

public class IfExam {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("score is bigger then 90.");
			System.out.println("Class : A");
		} else if(score < 90) {
			System.out.println("score is smaller then 90.");
			System.out.println("Class : B");
		}
		System.out.println("THE END");
	}
}
