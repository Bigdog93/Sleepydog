package sec06.ch04;

public class SwitchMission {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;
		//Math.random() : 0 ~ 0.999.. 사이의 값중 랜덤한 값을 반환
		System.out.println("time : " + time);
		// time 8이면 "출근합니다."
		// time 9이면 "회의를 합니다."
		// time 10이면 "업무를 봅니다."
		// 나머지 시간이면 "외근을 나갑니다."
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
	}
}
