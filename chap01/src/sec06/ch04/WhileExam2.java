package sec06.ch04;

public class WhileExam2 {
	public static void main(String[] args) {

		int i = 0;
		while (true) {
			i++;
			if (i % 2 == 0) {
				continue; // while(조건식) 으로 되돌아간다.
			}
			if (i >= 10) {
				break;
			}
			System.out.println("i : " + i);
		}
		
		for(i = 0; i <= 10; i++) {
			if(i % 2 == 0) continue;
			System.out.println("i : " + i);
		}

		
	}
}
