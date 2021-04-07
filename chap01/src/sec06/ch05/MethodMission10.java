package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

//	private static void printMenu(String[] menu, int[] price) {
//		System.out.print("----<메뉴>");
//		for (int i = 1; i < menu.length; i++)
//			System.out.print("--------");
//		System.out.println();
//		for (int i = 0; i < menu.length; i++) {
//			System.out.printf("%d.%s\t", i + 1, menu[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < price.length; i++) {
//			System.out.printf("%6d\t", price[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < menu.length; i++)
//			System.out.print("--------");
//		System.out.println();
//	}
//
//	private static void printMenu2(String[] menu, int[] price) {
//		String str = "<메뉴>\n0. 반환";
//		for (int i = 0; i < menu.length; i++) {
//			str += String.format("%d. %s (%,d원)\n", i + 1, menu[i], price[i]);
//		}
//		System.out.println(str);
//	}
//
//	private static int select(String[] menu, int[] price) {
//		Scanner sc = new Scanner(System.in);
//		String select = sc.next();
//		int select_num = 0;
//		for (int i = 0; i < menu.length; i++) {
//			if (select.equals(menu[i]) || select.equals(Integer.toString(i))) {
//				select_num = i + 1;
//				sc.close();
//				return select_num;
//			}
//		}
//		sc.close();
//		return -1;
//	}
//
//	private static void menuOutput(String[] menu, int[] price, int select) {
//		if (select == -1) {
//			System.out.println("없는 메뉴입니다.");
//			return;
//		}
//	}
	
	
	
	/*------------------------ 메인 ------------------------------*/
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] menu = { "콜라", "사이다", "환타", "아이스티", "망고주스" };
//		int[] price = { 1000, 1200, 1300, 1500, 2000 };
//		printMenu2(menu, price);
//		int select = select(menu, price);
//		menuOutput(menu, price, select);
		
		
		
		Japangi2 japan = new Japangi2();
		while (japan.run) {
			japan.select();
			japan.menuOutput();
		}
	}
}

class Japangi2 {
	private String[] menu = { "콜라", "사이다", "환타", "아이스티", "망고주스" };
	private int[] price = { 1000, 1200, 1300, 1500, 2000 };
	private int input = 0;
	private int select_num = 0;
	boolean run = false;

	Japangi2() {
		this.run = true;
		printMenu();
	}

	Scanner sc = new Scanner(System.in);

	void printMenu() {
		System.out.print("----<메뉴>");
		for (int i = 1; i < menu.length; i++)
			System.out.print("--------");
		System.out.println();
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("%d.%s\t", i + 1, menu[i]);
		}
		System.out.println();
		for (int i = 0; i < price.length; i++) {
			System.out.printf("%6d\t", price[i]);
		}
		System.out.println();
		for (int i = 0; i < menu.length; i++)
			System.out.print("--------");
		System.out.println();
		System.out.print("금액 투입 > ");
		input += sc.nextInt();
	}

	void select() {

		System.out.print("메뉴 선택 > ");
		String select = sc.next();
		if (select.equals("반환") || select.equals(Integer.toString(0))) {
			System.out.println("거스름 돈 : " + input);
			run = false;
			select_num = -2;
			return;
		}
		for (int i = 1; i <= menu.length; i++) {
			if (select.equals(menu[i - 1]) || select.equals(Integer.toString(i))) {
				select_num = i - 1;
				return;
			}
		}
		select_num = -1;
	}

	void menuOutput() {

		if (select_num == -1) {
			System.out.println("없는 메뉴입니다.");
			return;
		} else if (select_num == -2) {
			return;
		}
		if (input - price[select_num] < 0) {
			System.out.printf("잔액이 부족합니다.  잔액 : %,d\n", input);
			return;
		}
		input -= price[select_num];
		System.out.printf("%s가 나왔습니다. 잔액 : %,d\n", menu[select_num], input);
	}

}
