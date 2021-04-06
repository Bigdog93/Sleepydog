package sec06.ch05;

public class MethodExam2 {
	public static void main(String[] args) {
		/*
		 메소드 종류
		 리턴타입 : void, non-void
		 매개변수 : O, X
		 */
		voidSum(10, 20);
		
		int result = intSum(10, 20);
		System.out.println(result);
	}
	
	private static void voidSum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}
	
	private static int intSum(int n1, int n2) {
		return n1 + n2;
	}
}
