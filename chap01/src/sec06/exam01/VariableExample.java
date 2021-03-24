package sec06.exam01;

public class VariableExample {
	public static void main(String[] args) {
		/* 멀티라인 */
		// 싱글라인
		int a; // 변수선언
		a = 10; // 변수 초기화 (10 : 초기값)

		int value = 10; // 선언과 동시에 초기화, = : 오른쪽 값을 복사해서 왼쪽으로.
		int result = value + 10;
		System.out.println(result); // 자바에서 console에 값 찍을 때 쓰는 명령
	}
}