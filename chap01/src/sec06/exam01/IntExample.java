package sec06.exam01;

/* 
	정수 모두 정리
	
 */
public class IntExample {
	public static void main(String[] args) {
		byte b = 10; // 1byte : -128 ~ 127
		short s = 20; // 2byte : -32769 ~ 32767
		int i = 30; // 4byte : -2147483648 ~ 2147483647
		long l = 40; // 8byte : -9223372036854775808 ~ 9223372036854775807

		// 자동형변환
		s = b; // -> 더 큰 타입으로 가는 경우
		// 수동형변환
		s = (short)i; // -> 더 작은 타입으로 가는 경우
		
		char c = 'a';
		System.out.println((int)c);
	}
}
