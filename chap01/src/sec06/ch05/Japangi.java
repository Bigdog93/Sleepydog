package sec06.ch05;

import java.util.Scanner;

public class Japangi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"콜라", "오렌지주스", "사이다", "설사"};
		int[] price = {500, 700, 1300, 20000};
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("메뉴를 고르던지 말던지 씨발");
			System.out.println("1.콜라 | 2.오렌지주스 | 3.사이다 | 4.설사 | 5. 나가기");
			System.out.println("500원 |   700원   |  1300원  | 20000원");
			int select = sc.nextInt();
			if(select == 5) break;
			
			System.out.println("금액을 투입해 주십시오. 가격 : " + price[select - 1]);
			int input = sc.nextInt();
			System.out.println("선택하신 음료는 "+menu[select-1]+"입니다.");
			if(price[select - 1] <= input) {
				System.out.println("잔액은 "+ (input - price[select - 1])+"원 입니다.");
			}else {
				System.out.println("금액이 모자랍니다.");
			}
			
			
		}
		
	}
}
