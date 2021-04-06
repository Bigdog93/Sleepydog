package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String[] menu = { "콜라", "사이다", "환타", "아이스티", "망고주스" };
		int[] price = { 1000, 1200, 1300, 1500, 2000 };
		System.out.print("금액 투입 > ");
		input += sc.nextInt();
		while (true) {
			System.out.println("-------------------------------------------------------------------------------");
			for (int i = 0; i < menu.length; i++) {
				System.out.printf("%d.%s\t", i + 1, menu[i]);
			}
			System.out.println();
			for (int i = 0; i < menu.length; i++) {
				System.out.printf(" %,3d원\t", price[i]);
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");
			int select = sc.nextInt();

			int arrSelect = select - 1;
			if (select == 0)
				break; // break 말고 while의 조건식을 boolean형 변수로 주고, 여기서 false를 만들면 종료 후 다시 안 써줘도 된다.?
			else if (select > 0 && arrSelect < menu.length) {
				if (input >= price[arrSelect]) {
					input -= price[arrSelect];
					System.out.printf("%s를 선택하셨습니다. 가격 : %,3d  잔액 : %,3d\n", menu[arrSelect], price[arrSelect], input);
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else {
				System.out.println("메뉴 중 골라주세요");
			}

		}
		System.out.printf("종료 - 잔액은 : %,3d원", input);
		sc.close();
	}
}
