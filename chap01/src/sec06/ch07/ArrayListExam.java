package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {
	public static void main(String[] args) {
		List al = new ArrayList();
		List ll = new LinkedList();
		
		al.add(10);
		al.add(10.1);
		al.add("하하");;
		al.add(new Card("뭘봐","이새끼야"));
		
		int val2 = (int)(al.get(0));
		
		Object obj = al.get(1);
		double val = (double)obj;
		System.out.println("val : " + val);
		
		
		
		
//		MyList list = new MyArrayList();
		
		
		
		
	}
}
