package sec06.ch04;

import java.util.Arrays;

public class ForExam4 {
	public static void main(String[] args) {
		String[] strArr = {"A", "B", "C", "D", "E", "F"};
		
		for(String str : strArr) {
			System.out.print(str + " ");
		} System.out.println();
		
		for(int i = strArr.length-1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		} System.out.println();
		
		String[][] strArr2 = {{"A", "B", "C", "D", "E", "F"}, {"G", "H"}};
		
		for(String[] str : strArr2) {
			System.out.println(Arrays.toString(str));
		}
	}
}
