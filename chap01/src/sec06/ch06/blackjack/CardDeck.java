package sec06.ch06.blackjack;

public class CardDeck {
	private final Card[] DECK; // 전역변수에 바로 값을 주는걸 명시적 초기화
	// final 값을 준 친구는 바로 초기값을 줘야 하지만, 생성자에서 초기화를 해줄 경우 바로 초기값을 안줘도 에러가 뜨지 않는다.
	// 레퍼런스 변수의 final은 그 변수 자체의 값, 주소값을 바꿀 수 없는 것 뿐, 실체-인스턴스-는 바꿀 수 있다.
	// 배열의 경우, DECK이 new Card[52]만을 참조할 수 있고, 각 방의 값은 바꿀 수 있다.
	static String[] patt = { "Spades", "Hearts", "Diamonds", "Clubs" };
	static String[] symb = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public CardDeck() {
		DECK = new Card[patt.length * symb.length];
		int cnt = 0;
//		for(int i = 0; i < patt.length; i++) {
//			for(int j = 0; j < symb.length; j++) {
//				DECK[cnt++] = new Card(patt[i], symb[j]);
//			}
//		}
		for (String i : patt) {
			for (String j : symb) {
				DECK[cnt++] = new Card(i, j);
			}
		}
	}
	// String.valueOf(obj) : String형태로 return
	// 원시타입은 참조타입으로 형변환 불가능

	Card getOneCard() {
		/* 재귀함수 써보기 */
//		while (true) {
//			int i = (int) (Math.random() * 52);
//			if (DECK[i] != null) {
//				Card drawing = DECK[i];
//				DECK[i] = null;
//				return drawing;
//			}
//		}
		Card c = null;
		int i;
		do {
			i = (int) (Math.random() * DECK.length);
			c = DECK[i];
		} while (c == null);
		
		DECK[i] = null;
		
		return c;
	}
	
	void printAll() {
		for(int i = 0; i < DECK.length ; i++) {
			System.out.println(DECK[i]);
		}
	}

	Card toStr(int i) {
		return DECK[i];
	}

}
