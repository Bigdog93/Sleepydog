package sec06.ch06;
/*
 접근제어자
	 private
	 	-같은 class 안에서만 접근할 수 있다.
	 default
	 	-같은 패키지 내에서 접근할 수 있다. (현재 패키지의 하위 패키지에서도 접근할 수 없음)
	 protected
	 	-같은 패키지 내에서, 다른 패키지 중 상속받은 애들만 접근할 수 있다.
	 public
	 	-프로젝트 어디서든 접근 할 수 있다.
 
 목적
 	개발자 자신이 실수하지 않게 하기위해서
 	모듈의 캡슐화를 위해서
 */
public class AccessExam {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		
		java.util.Scanner sc = new java.util.Scanner(System.in); // 임포트 하는 이유...
		
		at.printNum();
	}
}

class AccessTest {
	private int num;
	void printNum() {
		System.out.println(num);
	}
}
