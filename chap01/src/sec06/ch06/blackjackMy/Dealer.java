package sec06.ch06.blackjackMy;

public class Dealer extends Player{
	@Override
	void takeCard(Deck dec) {
		Card get = dec.draw();
		own.add(get);
		score += get.getNumVal();
		System.out.println("딜러가 카드를 뽑았습니다.");
	}
	
	void autoTC() {
		while(true) {}
	}
}
