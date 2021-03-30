package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 10) + 1;
		System.out.println("star : " + star);

		for (int i = 0; i < star; i++) {
			for (int j = 1; j < star - i; j++) {
				System.out.print("_");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		for (int i = star; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("_");
			}
			for (int j = 0; j <= star - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		String symb = "_";
		for(int i = star; i > 0; i--) {
			for(int j = 1; j <= star; j++) {
				if(j >= i) symb = "*";
				System.out.print(symb);
			}
			symb = "_";
			System.out.println();
		}
		
	}
}
