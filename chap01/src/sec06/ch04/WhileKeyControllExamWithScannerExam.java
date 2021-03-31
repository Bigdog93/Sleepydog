package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControllExamWithScannerExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		System.out.println("-------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 중지");
		System.out.println("-------------------");
		
		while(run) {
			System.out.println("선택 : ");
			
			int inputVal = sc.nextInt();
			if(inputVal == 1) {
				speed++;
			}else if(inputVal == 2) {
				speed--;
			} else if(inputVal == 3) {
				run = false;
			} else {
				System.out.println("1, 2, 3번만 입력해주세요");
				continue;
			}
			System.out.println("현재 속도 : " + speed);
			
		}
		System.out.println("끝");
		sc.close();
		
		
	}
}

