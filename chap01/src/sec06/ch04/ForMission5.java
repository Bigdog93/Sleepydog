package sec06.ch04;

public class ForMission5 {
	public static void main(String[] args) {
		// 2 ~ 9단 구구단 출력
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//			System.out.println();
//		}
		
		// 3 ~ 7 사이 랜덤값 만큼 별 줄, 열로 프린트
		int star = (int)(Math.random() * 5) + 3;
		System.out.println("star : " + star);
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
