package sec06.ch05;

public class MethodExam3 {
	public static void main(String[] args) {
		printSeason(3);
	}
	
	private static void printSeason(int mon) {
//		if(mon >= 3 && mon < 6) {
//			System.out.println("봄");
//		}else if(mon >= 6 && mon < 9) {
//			System.out.println("여름");
//		}else if(mon >= 9 && mon < 12) {
//			System.out.println("가을");
//		}else if(mon == 12 || mon >= 1 && mon < 3) {
//			System.out.println("겨울");
//		}else {
//			System.out.println("잘 못 입력하셨습니다.");
//		}
		switch(mon) {
		case 3: case 4: case 5:
			System.out.println("봄");
			return;
		case 6: case 7: case 8:
			System.out.println("여름");
			return;
		case 9: case 10: case 11:
			System.out.println("가을");
			return;
		case 12: case 1: case 2:
			System.out.println("겨울");
			return; // 메소드는 return; 을 만나야 끝이난다. (보이드의 경우 생략하면 컴파일시 생성) 보이드는 리턴 뒤 데이터 없음
		}
		System.out.println("잘 못 입력하셨습니다.");
	}
}
