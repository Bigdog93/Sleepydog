package sec06.ch06.blackjack;

public class CardMain2 {
	public static void main(String[] args) {
		CardDeck dec = new CardDeck();
		Card card1 = dec.getOneCard();
		System.out.println(card1);
		card1 = dec.getOneCard();
		System.out.println(card1);
		
		System.out.println("----printAll------------------");
		
		dec.printAll();
	}
}
