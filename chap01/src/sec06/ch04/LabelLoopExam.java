package sec06.ch04;

public class LabelLoopExam {
	public static void main(String[] args) {

		OUTER: for (int i = 0; i < 3; i++) {

			for (int j = 100; j < 104; j++) {
				if (j == 102) {
					continue;
				}
				System.out.printf("%d - %d \n", i, j);
			}
			
			System.out.println();
		}
	}
}
