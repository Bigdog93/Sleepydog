package sec06.ch06.blackjack;

import java.util.Arrays;

public class CardMain {
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		for(int i = 0 ; i < 52; i++)
		System.out.println(deck.getCard(i) + " " + deck.getCard(i).getNumVal());
		
		CardDeck deck2 = new CardDeck();
		for(int i = 0; i < 52; i++) {
			System.out.println(deck2.toStr(i));
		}
		
		System.out.println(deck2.getOneCard());
		
	}
	
	public static void println(String str) {
		System.out.println(str); // 출력한 str은 c1, c2가 가지고 있던 주소값이 toString()으로 인해 String화 된것.
	}
	public static void println(Object obj) { // c1, c2를 Object 타입으로 받는다.
		System.out.println("obj!!"); // obj!! 를 찍는다.
		println(obj.toString()); // .toString() 의 반환타입이 String이기 때문에 위 메소드 호출
	} // 즉, 모든 print 메소드는 어떤 타입을 받아도 toString 메소드를 통해 String 타입을 받는 친구들로 몰려있다.
}
