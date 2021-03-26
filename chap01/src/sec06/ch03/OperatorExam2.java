package sec06.ch03;

public class OperatorExam2 {
	public static void main(String[] args) {
		int n1 = 10;
		n1++;
		System.out.println("n1 : "+n1);
		++n1;
		System.out.println("n1 : "+n1);
		n1--;
		System.out.println("n1 : "+n1);
		--n1;
		System.out.println("n1 : "+n1);
		
		System.out.println("--------------------------");
		
		
		//논리 부정 연산자 (!)
		boolean bool = false;
		System.out.println("false : " + bool);
		System.out.println("!false : " + !bool);
		bool = !bool;
		System.out.println("!false : " + bool);
		System.out.println("(3 > 2) : " + (3>2));
		System.out.println("!(3 > 2) : " + !(3>2));
	}
}
