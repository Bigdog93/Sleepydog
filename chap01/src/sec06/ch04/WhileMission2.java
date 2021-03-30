package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
		int sum = 0;

		while (true) {
			int val = (int) (Math.random() * 11);
			System.out.println("val : " + val);
			if(val == 0) break;
			sum += val;
		}
		System.out.println("sum : " + sum);
		
//		do {
//			int val = (int)(Math.random() * 11);
//			System.out.println("val : " + val);
//			sum += val;
//			if(val == 0) break;
//		} while(true);
		
		System.out.println("Pull test");

	}
}
