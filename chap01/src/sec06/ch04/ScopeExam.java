package sec06.ch04;

public class ScopeExam {
	int i;
	public static void main(String[] args) {
		// 스코프 (변수 & 상수가 살아있는 범위)
		
		ScopeExam p = new ScopeExam();
		System.out.println(p.i);
		
		int a = 10;
		
		if(a > 9) {
			System.out.println("a : " + a);
			int j;
		}
//		System.out.println("j : " + j); // 중괄호를 빠져나오면 변수 없어짐
		
		
	}
}
