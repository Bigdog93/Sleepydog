package sec06.ch04;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {

//		{ // 134p 연습문제 3. 1 ~ 100 까지 중 3의 배수의 합 구하기
//			int sum = 0;
//
//			for (int i = 0; i < 101; i++) {
//				if (i % 3 == 0) {
//					sum += i;
//				}
//			}
//			System.out.println("sum : " + sum);
//		} // 답 : 1683

//////////////////////////////////////////////////////////////

//		{ // 134p 연습문제 4. 두 눈금의 합이 5가 나올때까지 주사위 굴리기
//			int n1, n2;
//			while(true) {
//				n1 = (int)(Math.random() * 6) + 1;
//				n2 = (int)(Math.random() * 6) + 1;
//				System.out.printf("(%d, %d)\n", n1, n2);
//				if(n1 + n2 == 5) break;
//			}
//		}

/////////////////////////////////////////////////////////////

//		{ // 135p 연습문제 5. - 4x + 5y = 60 의 모든 해 구하기
//			for (int i = 0; i < 11; i++) {
//				for (int j = 0; j < 11; j++) {
//					if (4 * i + 5 * j == 60)
//						System.out.printf("(%d, %d)\n", i, j); // 밑에 break;를 추가해주면 퍼포먼스 증가. 하나의 x값에 y값이 하나밖에 없기때문에 다른 y값 찾을 필요가 없엉.
//				}
//			}
//		} // 답 : (5, 8), (10, 4)

////////////////////////////////////////////////////////////////

//		{ // 135p 연습문제 6. 별로 탑 쌓기
//			for (int i = 0; i < 5; i++) {
//				for (int j = 0; j <= i; j++)
//					System.out.print("*");
//				System.out.println();
//			}
//		}

////////////////////////////////////////////////////////////////

		{ // 135p. 연습문제 7. ATM 처럼 보이게 만들기
			boolean run = true;
			int balance = 0;
			Scanner sc = new Scanner(System.in);

			while (run) {
				System.out.println("-------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-------------------------------");
				System.out.print("선택 > ");

				int select = sc.nextInt();

				switch (select) {
				case 1:
					System.out.print("예금액 > ");
					int inputMoney = sc.nextInt();
					balance += inputMoney;
					break;
				case 2:
					System.out.print("출금액 > ");
					int outputMoney = sc.nextInt();
					balance -= outputMoney;
					break;
				case 3:
					System.out.print("잔고 > ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("1 ~ 4번 중 입력해 주십시오.");
				}
			}
			sc.close();
			System.out.println("프로그램 종료");
		}

	}
}
