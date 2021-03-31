package sec06.exam01;

public class Hello {
	//메인 메소드(프로그램 시작점!!)
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		test t = new test();
		
		int i = 0;
		
		i = t.pul(i++);
		
	}
}


class test {
	int pul(int i) {
		System.out.println(i);
		return i;
	}
}