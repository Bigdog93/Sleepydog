package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5 + 3);
		System.out.println("star : " + star);

		for (int i = 0; i <= star; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < star; i++) {
			for (int j = star - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		for (int i = star; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
