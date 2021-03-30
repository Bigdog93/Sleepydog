package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		// 2*1=2	3*1=3	4*1=4 ... 9*1=9
		// 2*2=4	3*2=6	5*2=10... 9*2=18
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j*i);
			}
			System.out.println();
		}
		
	}
}
