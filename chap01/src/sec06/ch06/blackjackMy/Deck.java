package sec06.ch06.blackjackMy;

public class Deck {
	private Card[] card = new Card[52];
	private static String[] patt = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private static String[] symb = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private boolean deckEmpty = false;

	Deck() {
		int cnt = 0;
		for (int i = 0; i < patt.length; i++) {
			for (int j = 0; j < symb.length; j++) {
				if (j + 1 < 10) {
					card[cnt++] = new Card(patt[i], symb[j], j < 10 ? j + 1 : 10);
				}
			}
		}
	}
	
	void checkEmpty() {
		deckEmpty = true;
		for(int i = 0; i < card.length; i++) {
			if(card[i] != null) {
				deckEmpty = false;
				break;
			}
		}
	}

	Card draw() {
		checkEmpty();
		if (deckEmpty == false) {
			int i = (int) (Math.random() * card.length);
			if (card[i] == null)
				return draw();
			Card drawC = card[i];
			card[i] = null;
			return drawC;
		}else return null;
	}
}
