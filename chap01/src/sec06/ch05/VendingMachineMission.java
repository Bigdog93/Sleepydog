package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		/*
		 * 아래는 콘솔에 출력해야 하는 내용입니다.
		 * 
		 * <메뉴> 1. 콜라 (1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원)
		 */
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String[] menu = { "콜라", "사이다", "환타", "아이스티", "망고주스" };
		int[] price = { 1000, 1200, 1300, 1500, 2000 };
		boolean outofLange = false;

		System.out.print("금액 투입 > ");
		input += sc.nextInt();
		System.out.println("메뉴를 골라주세요. (반환 : 0)");
		OUTER: while (true) {
			System.out.println("-------------------------------------------------------------------------------");
			for (int i = 0; i < menu.length; i++) {
				System.out.printf("%d.%s\t", i + 1, menu[i]);
			}
			System.out.println();
			for (int i = 0; i < menu.length; i++) {
				System.out.printf("%,3d원\t", price[i]);
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");
			String select = sc.next();

			for (int i = 0; i < menu.length; i++) {
				if (select.equals("반환") || select.equals(Integer.toString(0))) {
					break OUTER;
				} else if (select.equals(menu[i]) || select.equals(Integer.toString(i + 1))) {
					if (input >= price[i]) {
						input -= price[i];
						System.out.printf("%s가 나왔습니다.\t", menu[i]);
						System.out.printf("잔액 : %,3d\n", input);
						outofLange = false;
						break;
					} else {
						System.out.println("잔액이 부족합니다.");
						outofLange = false;
						break;
					}
				} else {
					outofLange = true;
				}
			}
			if (outofLange)
				System.out.println("메뉴 중 골라주세요");
		}
		System.out.printf("거스름돈 : %,3d", input);
		sc.close();
	}
}