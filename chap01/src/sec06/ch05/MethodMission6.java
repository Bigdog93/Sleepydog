package sec06.ch05;

public class MethodMission6 {

	private static int getRandomScore(int min, int max) {
		int rand = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("score : " + rand);
		return rand;
	}

	private static char getGrade(int score) {
		int deci = score / 10;
//		char[] arrGrade = {'A', 'B', 'C', 'D', 'E'};
//		int diff = 9;
//		if(score == 100) diff = 10;
//		int gradeIndex = diff - deci;
//		if(gradeIndex > 4) gradeIndex = 4;
//		return arrGrade[gradeIndex];
		switch (deci) {
		case 9:
		case 10:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'E';
		} // 실무였다면 0 ~ 100 밖의 점수 입력에 대한 대비 해둘것.
	}

	private static char getGrade2(int score) {
		int i = score % 10;
		if (i >= 8 || score == 100) {
			return '+';
		} else if (i <= 3) {
			return '-';
		}
		return ' ';

	}

	public static void main(String[] args) {
		int score = getRandomScore(50, 100);

		char grade = getGrade(score);
		char grade2 = getGrade2(score);

		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
}
