package sec06.ch08;

public class ExceptionExam2 {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		float result = c.div(10, 2);
		
		System.out.println("result : " + result);
		
		float result2 = new Calc().div(5, 9);
		
		System.out.println("result2 : " + result2);
		
		System.out.println("result3 : " + c.div(3, 0));
		// 충격!! float은 '무한'의 개념을 알고 있었던 것. int는 바보라 모름
		float result4 = c.div(3, 0);
		
		System.out.println("result4 : " + result4);
		
		
	}
}


class Calc {
	float div(int n1, int n2) {
		try {
			return (float)n1 / n2;
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 메소드 안에서 try 또는 catch에서 return을 만나도!! 실행된다..ㄷㄷㄷ
			System.out.println("무조건 실행");
		}
		
		System.out.println("try 밖 실행");
		return 0;
	}
}