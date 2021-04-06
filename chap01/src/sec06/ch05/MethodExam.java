package sec06.ch05;

public class MethodExam {
	public static void main(String[] args) {
		/*
		 제어자 리턴타입(없으면 void) 메소드명 (매개변수타입 매개변수명) {
		 	기능
		 	return 반환값; (void일 경우 생략)
		 }
		 */
		int i = 20;
		int j = 10;
		System.out.println(sum(i, j)); // 메소드 호출, 매개변수로 들어가는 아이들은 Arguments(값). 정의(int a = 1) 같은게 들어가면 안된다.
		
		System.out.println(minus(i, j));
		
		
	}
	
	private static int sum(int n1, int n2) { // 선언부
		return n1 + n2; // 구현부
	}
	
	private static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
}
