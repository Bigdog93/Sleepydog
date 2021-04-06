package sec06.ch06;

import java.util.Scanner;

public class DrinkMachineExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] menu = { "콜라", "사이다", "환타", "아이스티", "망고주스" };
		int[] price = { 1000, 1200, 1300, 1500, 2000 };
		
		Drinks[] drinkArr = new Drinks[5];
		for(int i = 0; i < drinkArr.length; i++) {
			drinkArr[i] = new Drinks(menu[i], price[i]);
//			drinkArr[i] = drink;
		}
		
		for(int i = 0; i < drinkArr.length; i++) {
			System.out.println(drinkArr[i].nm + " (" + String.format("%,d원",drinkArr[i].price) + ")");
		}
		
		printMenu3(drinkArr);
		
	}
	
	private static void printMenu3(Drinks[] arr) {
		System.out.print("----<메뉴>");
		for (int i = 1; i < arr.length; i++)
			System.out.print("--------");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d.%s\t", i + 1, arr[i].nm);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%6d\t", arr[i].price);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++)
			System.out.print("--------");
		System.out.println();
	}
}
