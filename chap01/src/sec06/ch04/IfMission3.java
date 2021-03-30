package sec06.ch04;

public class IfMission3 {

	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 40) + 61;
		System.out.println(SCORE);
		//SCORE 값은 81 ~ 100 점 사이의 값이 된다. (실행할 때마다 달라진다)
		char grade = 'D';
//		90~100 A (98점 이상은 "A+", 97~94 "A", 90점 이상은 "A-")
		if(SCORE > 90) {
			grade = 'A';
		} else if(SCORE > 80) {
			grade = 'B';
		} else if(SCORE > 70) {
			grade = 'C';
		}
		
		int porM = SCORE % 10;
		char pM = '-';
		
		if(porM >= 7 || porM == 0) {
			pM = '+';
		}else if(porM >= 4) {
			pM = ' ';
		}
		
		System.out.printf("당신의 점수는 %d점이고, 학점은 %c%c입니당.", SCORE, grade, pM);		
		
		
	}

}
