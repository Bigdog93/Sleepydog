package sec06.ch08;
/* Exception(예외)
런타임 에러

*/
public class ExceptionExam {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		try { // 에러가 발생할 가능성이 있는 실행문
			System.out.println("에러 발생 전...");
//			arr[3] = 1;
			System.out.println(".");
			int result = 10 / 0;
			System.out.println(".");
			System.out.println("result : " + result);
			System.out.println(".");
		} catch (ArithmeticException e) { // 에러 발생했을 때 실행할 명령문
			System.out.println("수학적 에러 발생!!");
			System.out.println(e); // 어떤 에러인지만 출력
			e.printStackTrace(); // 에러 구문 전체 그대로 출력
		} catch (Exception e) {
			System.out.println("모르는 에러 발생!!");
			System.out.println(e);
		}
		finally { // 에러 생기든 안생기든 실행할 명령문 (얘는 옵션. 없어도 됨)
			System.out.println("무조건 실행!!");
		}
		
		System.out.println("끝"); // 에러가 발생해도 프로그램이 멈추지 않고 정상작동할 수 있게 해준다.(에러 발생했을 때, 우회할 길 만들어 주는 방법)
		
		
		// JSTL : JavaScript Tag Library
		}
}
