package sec06.ch06;

import java.util.Arrays;

public class StaticExam5 {
	
	static int num = 5;
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		
		StaticExam5 se5 = new StaticExam5();
		se5.n1 = 10;
		se5.n2 = 20;
		System.out.println(se5.sum());
		
		System.out.print(num);
	}
	
	int n1;
	int n2;
	int sum() {
		return n1 + n2;
	}
}
