package sec06.ch04;

public class SwitchExam {
	public static void main(String[] args) {
		int val = 7;
		switch (val) {
		default:
			System.out.println("값은 알수 없다."); // 꼭 밑에 있을 필요는 없다.
			break; // 맨 아래가 아닐때는 break; 적어주는게 좋다.
		case 1:
			System.out.println("값은 1이다.");
			break; // break; 없으면 밑으로 쭉 내려가면서 다 실행함.
		case 2:
			System.out.println("값은 2이다.");
			break;
		case 3:
			System.out.println("값은 3이다.");
			break;
		case 4:
			System.out.println("값은 4이다.");
			break;
		case 5:
		case 6:
			System.out.println("값은 5이거나 6이다.");
		}
		System.out.println("끝");
	}
}
