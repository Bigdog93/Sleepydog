package sec06.ch06.blackjack;

import java.util.Scanner;

public class Rule {
	static Deck dec = new Deck();
	static Player p1 = new Player();
	static Dealer d1 = new Dealer();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 시작하시겠습니까?\n1.예	2.아니오");
		int select = sc.nextInt();
		boolean run = false;
		if(select == 1) run = true;
		while(run) {
			d1.draw();
			p1.draw(dec);
			System.out.println("카드를 뽑으시겠습니까?\n 1.예 2.아니오");
			int more = sc.nextInt();
			if(more == 2) {
				break;
			}else {
				p1.draw(dec);
				p1.openCard();
			}
		}
		System.out.println("딜러 카드");
		d1.openCard();
		System.out.println("플레이어 카드");
		p1.openCard();
		String winner = null;
		if(d1.score > 21 && p1.score > 21) {
			System.out.println("둘 모드 21점을 넘겼습니다.");
		}else if(d1.score > 21 && p1.score <= 21) {
			System.out.println("딜러가 21점을 넘겼습니다.");
			winner = "플레이어";
		}else if(p1.score > 21 && d1.score <= 21) {
			System.out.println("플레이어가 21점을 넘겼습니다.");
			winner = "딜러";
		}else if(d1.score > p1.score) {
			System.out.println("딜러 점수 : " + d1.score);
			System.out.println("플레이어 점수 : " + p1.score);
			winner = "딜러";
		}else if(d1.score < p1.score) {
			System.out.println("딜러 점수 : " + d1.score);
			System.out.println("플레이어 점수 : " + p1.score);
			winner = "플레이어";
		}else if(d1.score == p1.score) {
			System.out.println("딜러 점수 : " + d1.score);
			System.out.println("플레이어 점수 : " + p1.score);
			winner = "없음";
		}
		System.out.println("승자 : " + winner);
		
		
		
	}
	
}
