package sec06.ch04;
// do ~ while 문
public class WhileExam3 {
	public static void main(String[] args) {
		// while문과의 차이점 : 명령문을 먼저 실행 하고 조건을 검사한다.(순서의 차이)
		
		int val = 0, sum = 0;
		do {
			val = (int)(Math.random() * 11);
			sum += val;
			System.out.println("val : " + val);
		}while(val != 0);
		
		System.out.println("sum : " + sum);
		
		sum = 0;
		val = 1;
		
		while(val != 0) {
			val = (int)(Math.random() * 11);
			sum += val;
			System.out.println("val : " + val);
		}
		System.out.println("sum : " + sum);
		
	}
}
