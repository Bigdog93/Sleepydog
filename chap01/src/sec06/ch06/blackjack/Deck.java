package sec06.ch06.blackjack;

public class Deck {
	private Card[] card = new Card[52];
	private static String[] patt = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private static String[] symb = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

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
	
	Card getCard(int i) {
		return card[i];
	}
	
	
	


	Card draw() {
		while (true) {
			int i = (int) (Math.random() * 52);
			if (card[i] != null) {
				Card drawing = card[i];
				card[i] = null;
				return drawing;
			}
		}
	}
}
