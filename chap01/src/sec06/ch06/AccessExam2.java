package sec06.ch06;

import sec06.ch06.acc.Access2;

public class AccessExam2 {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		
		at.printNum();
		Access2 ac2 = new Access2();
		
		int[] arr = new int[3];
		
//		arr.length = 10; 배열.length 변수는 final. 변경 불가.
		int j = arr.length;
	}
}
