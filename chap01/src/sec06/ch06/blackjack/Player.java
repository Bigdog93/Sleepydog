package sec06.ch06.blackjack;

import java.util.ArrayList;

public class Player {
	ArrayList<Card> own = new ArrayList<Card>();
	int score = 0;
	void draw(Deck dec) {
		own.add(dec.draw());
		score += dec.draw().getNumVal();
	}
	
	void openCard() {
		for(int i = 0; i < own.size(); i++) {
			System.out.println(own.get(i));
		}
	}
}
