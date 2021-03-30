package sec06.ch04;

public class ForExam2 {
	public static void main(String[] args) {
		//중첩 for문
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					for(int l = 0; l < 10; l++) {
						System.out.printf("%d%d%d%d\n", i, j, k, l);
					}
				}
			}
		}
		for(int i = 0; i < 10000; i++) {
			System.out.printf("%04d\n", i);
		}
	}
}
