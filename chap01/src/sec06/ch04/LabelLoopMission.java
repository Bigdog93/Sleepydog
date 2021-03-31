package sec06.ch04;

public class LabelLoopMission {
	public static void main(String[] args) {
		
		OUTER: for(int n1 = 1; n1 <= 9; n1++) {
			for(int n2 = 0; n2 <=9; n2++) {
				if(n1 == 8 && n2 == 8) break OUTER;
				else if(n1 == n2) break; // break; 일 경우에는 for문을 벗어나 '아래로'내려간다. (println() 실행 됨)
				// continue OUTER; 일 경우에는 만나자마자 OUTER: 문으로 돌아간다. (println() 실행 안됨)
				System.out.printf("%d%d\n", n1, n2);
			}
			System.out.println();
		}
		
		System.out.println("끝");
		
	}
}
