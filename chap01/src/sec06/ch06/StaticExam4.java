package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		
		StaticExam3.main(args); // 다른 클래스의 메인메소드 호출하기
		
		CalcInstance2 ci2 = new CalcInstance2();
		
		ci2.num1 = 10;
		ci2.num2 = 20;
		System.out.println("result : " + ci2.sum());
		
		
		
	}
}


class CalcStatic2 {
	static int num1;
	static int num2;
	CalcStatic2() {
		
	}
	static int sum() { // static 메소드는 인스턴스 생성 없이 호출할 수 있기 때문에 인스턴스를 생성해야만 만들어지는 인스턴스 변수는 사용할 수 없다.
		// static 변수만을 다루거나, parameter로 넘어온 애들만을 다룬다면, static 메소드로 선언하는것 고려할 것.
		return num1 + num2; // this. 은 객체 자신의~ 를 뜻하기 때문에 객체 생성이 필요없는 static 메소드에는 쓸 수 없다.
		// 매개변수로 static 변수와 같은 변수명을 받는다면, 클래스명.static변수명으로 부를수 있다. 
	}
}

class CalcInstance2 {
	static int num1;
	int num2;
	int sum() { // instance 메소드는 instance 변수와 static 변수 모두 쓸 수 있다.(비권장)
		return this.num1 + num2;
	}
}