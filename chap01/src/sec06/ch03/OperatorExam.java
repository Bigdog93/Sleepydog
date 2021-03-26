package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		/*	산술연산자
		 
		 
		 
		 */
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 / n2);
		System.out.println((float)n1 / n2);
		System.out.println(n1 * n2);
		
		
		int mod = 10 % 3; // 나누고 남은 나머지 구하기
		System.out.println("mod : " + mod);
		
		System.out.println("------------------------");
		int n3 = 1;
		System.out.println("n3 : " + n3);
		System.out.println("-n3 : "+ -n3);
		System.out.println("--n3 : "+ --n3);
		System.out.println("n3 : " + n3);
		System.out.println("++n3 : " + ++n3);
		System.out.println("n3 : " + n3);
		System.out.println("n3-- : " + n3--);
		System.out.println("n3 : " + n3);
		System.out.println("n3++ : " + n3++);
		System.out.println("n3 : " + n3);
	}
}
