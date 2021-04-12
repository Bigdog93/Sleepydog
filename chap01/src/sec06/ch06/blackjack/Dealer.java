package sec06.ch06.blackjack;

import java.util.ArrayList;

public class Dealer {
	ArrayList<Card> own = new ArrayList<Card>();
	int score = 0;
	void draw() {
		if(score <= 16) {
			System.out.println("딜러가 카드를 뽑았습니다.");
			own.add(Rule.dec.draw());
			score += Rule.dec.draw().getNumVal();
		
		}else {
			return;
		}
	}
	void openCard() {
		for(int i = 0; i < own.size(); i++) {
			System.out.println(own.get(i));
		}
	}
}
