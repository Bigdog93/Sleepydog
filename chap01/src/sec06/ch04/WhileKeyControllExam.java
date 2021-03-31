package sec06.ch04;

import java.io.IOException;

public class WhileKeyControllExam {
	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("-------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-------------------");
				System.out.println("선택 : ");
			}
			if(keyCode == 49) { // 키보드의 1번 key
				speed++;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 50) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 51) { //키보드의 3번 key
				run = false;
			}
			
			try {
				keyCode = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nkeyCode : " + keyCode);
		}
		
	}
}
