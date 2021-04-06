package sec06.ch05;

import java.util.Stack;

public class MethodMission3 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10);
		sumAllFromTo(2, 4);
		sumAllFromTo2(1, 100);
		sumAllFromTo2(100, 1);
		sumAllFromTo(50, 50);
		sumAllFromTo2(50, 50);
	}
	
	private static void sumAllFromTo(final int n1, final int n2) { // 변화를 안 줄거면 final 붙여주면 좀 더 빨라진데..
		int sum = 0;
		int min = n1;
		int max = n2;
		
		if(n1 > n2) {
			min = n2;
			max = n1;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	private static void sumAllFromTo2(final int n1, final int n2) {
		int sum = 0;
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		for(int i = n1; i >= n2; i--) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}

