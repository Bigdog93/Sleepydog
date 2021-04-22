package sec06.ch08;

public class ExceptionExam3 {
	public static void main(String[] args) {
		Calc2 c2 = new Calc2();
		
		int result = 0;
		try {
			result = c2.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생했게요? 안했게요??");
		}
		
		System.out.println("result : " + result);
	}
}

class Calc2 {
	int div(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}