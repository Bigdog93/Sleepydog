package sec06.ch04;

public class ForMission4 {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 8) + 2;
		System.out.println("rand : " + rand);
		for (int i = 6; i < 15; i++) {
			System.out.printf("%d * %d = %d\n", rand, i - 5, rand * (i - 5));
		}
		System.out.println("==============================================");
		{
			int i = 0;
			while (true) {
				System.out.printf("%d * %d = %d\n", rand, i + 1, rand * (i + 1));
				i++;
				if (i == 9)
					break;
			}
		}
	}

}
