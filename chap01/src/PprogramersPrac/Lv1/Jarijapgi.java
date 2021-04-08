package PprogramersPrac.Lv1;

import java.util.Scanner;

public class Jarijapgi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] studs = new String[33];
		
		for(int i = 0; i < 33; i++) {
			studs[i] = String.format("%d", i+1);
		}
		
//		Stack orde = new Stack();
		int cnt = 0;
		OUTER: while(true) {
			int rand = (int)(Math.random() * 33);
			if(!studs[rand].equals("0")) {
				System.out.println(studs[rand] + " : " + ++cnt + "등");
//				orde.add(studs[rand]);
				studs[rand] = "0";
				
			}
			for(int i = 0; i < studs.length; i++) {
				if(!studs[i].equals("0")) {
					continue OUTER;
				}
			}
			
			
			
			break;
		}
//		for(int i = orde.size(); i > 0; i--) {
//			System.out.println(orde.pop());
//		}
		
		
		
		
		
	}
}
