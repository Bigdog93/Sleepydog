package sec06.ch04;

public class ForMission2 {
	public static void main(String[] args) {
		//1 ~ 3 숫자를 더하시오.
//		int sum = 0;
//		sum += 1;
//		System.out.println("sum : " + sum);
//		
//		sum += 2;
//		System.out.println("sum : " + sum);
//		
//		sum += 3;
//		System.out.println("sum : " + sum);
		
		//for문을 이용하여 1 ~ 20 까지 더하시옹.
		int sum = 0;
		for(int i = 0; i < 20; i++) {
			System.out.print("sum(" + sum + ")");
			sum += (i + 1);
			System.out.println(" + " + (i + 1) + " = " + sum);
		}
		System.out.println("sum : " + sum);
//		int o = 0;
//		while(true) {
//			o++;
//			if(o == 10000000) {
//				
//			}
//		}
	}
}
