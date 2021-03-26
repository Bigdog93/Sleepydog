package sec06.ch03;

public class AssignmentOperatorExam {
	public static void main(String[] args) {
		int n1 = 0;
		n1 = n1 + 5;
		System.out.println("n1 : " + n1);
		
		int n2 = 0;
		n2 += 5;
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3 -= 4;
		System.out.println("n3 : " + n3);
		
		int val = 356;
		System.out.println(val / 100 * 100);
		
		Test ts = new Test(20);
		
		System.out.println(ts.value);
		ts.mulself();
		System.out.println(ts.value);
		ts.print();
	}
}

class Test { // 클래스 선언
	static int value_all = 100; // 클래스 변수
	int value; // 인스턴스 변수
	Test() { // 기본 생성자
		this.value = 0;
	}
	Test(int value) { // 매개변수 생성자
		this.value = value;
	}
	int mulself() { // (int)타입 값을 반환하는 메소드 :: return 값; 부분 필수
		this.value = value * value;
		return value;
	}
	void print() { // 반환값이 없는 메소드
		System.out.println("현 객체의 value값은 : " + this.value + "입니다.");
	}
}