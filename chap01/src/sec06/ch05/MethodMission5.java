package sec06.ch05;

public class MethodMission5 {

	// 중복된 소스 최대한 제거
	// 메소드 재활용 극대화

	public static void main(String[] args) {
		for (int i = 10; i < 31; i += 10) {
			printStarLine(makeStars(i));
		}

		printStarSqure(makeStars(2, 5));
		
		printStarTri(makeStars(2, 5));
	}

	private static int makeStars(int n) {
		int rand = (int) (Math.random() * (n + 1) + 1);
		System.out.println("star : " + rand);
		return rand;
	}

	private static int makeStars(int min, int max) {
		int rand = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("star : " + rand);
		return rand;
	}

	private static void printStarLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	private static void printStarSqure(int n) {
		for (int i = 0; i < n; i++) {
			printStarLine(n);
		}
	}
	
	private static void printStarTri(int n) {
		for(int i = 1; i <= n; i++) {
			printStarLine(i);
		}
	}
}
