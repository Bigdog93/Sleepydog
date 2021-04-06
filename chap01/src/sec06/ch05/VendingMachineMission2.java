package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String[] menu = { "콜라", "사이다", "환타", "아이스티", "망고주스" };
		int[] price = { 1000, 1200, 1300, 1500, 2000 };
		
		while(true) {
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
			
			if(select == 0) break;
			else if(select > 0 && select < menu.length) {
				System.out.printf("%s를 선택하셨습니다. 가격 : %,3d\n", menu[select-1], price[select-1]);
				input += price[select-1];
			}else {
				System.out.println("메뉴 중 골라주세요");
			}
			
		}
		System.out.printf("종료 - 사용한 금액은 : %,3d원", input);
		sc.close();
	}
}
