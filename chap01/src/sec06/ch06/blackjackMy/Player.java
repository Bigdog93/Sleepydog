package sec06.ch06.blackjackMy;

import java.util.ArrayList;

public class Player {
	ArrayList<Card> own = new ArrayList<Card>();
	int score = 0;
	
	void takeCard(Deck dec) {
		Card get = dec.draw();
		own.add(get);
		score += get.getNumVal();
		System.out.println(get + " 카드를 뽑았습니다.");
	}
	
	void openCard() {
		for(int i = 0; i < own.size(); i++) {
			System.out.println(own.get(i));
		}
	}
	
}
