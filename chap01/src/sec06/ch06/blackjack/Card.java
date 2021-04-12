package sec06.ch06.blackjack;

public class Card {
	private String pattern;
	private String symbol;
	private int numVal;
	Card(String pattern, String symbol) {
		this.pattern = pattern;
		this.symbol = symbol;
	}
	Card(String pattern, String symbol, int numVal) {
		this.pattern = pattern;
		this.symbol = symbol;
		this.numVal = numVal;
	}
	public String getPattern() {
		return pattern;
	}
	public String getSymbol() {
		return symbol;
	}
	public int getNumVal() {
		return numVal;
	}
	@Override
	public String toString() { // 프린트로 객체를 직접 호출했을때 찍히는거 오버라이딩
		return String.format("%s (%s)", pattern, symbol);
	}
}
