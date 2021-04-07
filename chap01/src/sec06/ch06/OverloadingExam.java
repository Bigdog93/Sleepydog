package sec06.ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		Calc cal = new Calc();
		
		cal.sum(5, 10);
		cal.sum(5, 10, 15);
		System.out.println(cal.sum(1,2,3,4));
		
	}
}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	int sum(int n1, int n2, int n3, int n4) {
		return n1+n2+n3+n4;
	}
}
