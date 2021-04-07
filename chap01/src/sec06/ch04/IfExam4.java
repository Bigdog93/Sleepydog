package sec06.ch04;
// 3항 연산자.
// 조건식 ? 참 : 거짓
public class IfExam4 {
	public static void main(String[] args) {
		System.out.println(abs(10));
		System.out.println(abs(-10));
	}
	
	private static int abs(int val) {
//		if(val < 0) {
//			return -val;
//		}
//		return val;
		
		return val < 0 ? -val : val;
	}
}
