package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		// Wrapper Class - primitive 타입의 클래스형
		
		Integer num = new Integer(30);
		int num1 = 30;
		System.out.println(num.MAX_VALUE);
		System.out.println(num1 == num);
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.add(40));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		for(int i : list) { // for ~ each 가능
			System.out.println(i);
		}
	}
}
